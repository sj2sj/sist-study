package com.iu.s1.member;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberController {
	
	private MemberService memberService = null;
	
	public MemberController() {
		memberService = new MemberService();
	}
	
	public void start(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Member Controller 실행!");
		
		String uri = request.getRequestURI();
		
		int startIndex = uri.lastIndexOf("/");
//		int lastIndex = uri.lastIndexOf(".");
		int lastIndex = uri.length();
		
		String path = uri.substring(startIndex+1, lastIndex).toLowerCase();
		System.out.println("path:"+path);
		
		if ("memberlogin.do".equals(path)) {
			System.out.println("로그인 진행");
			String value = request.getParameter("id");
			System.out.println("id: "+value);
			
			value = request.getParameter("pw");
			System.out.println("pw: "+value);
		} /* ------------------------------------------------------------------------ memberJoin.do */
		else if ("memberjoin.do".equals(path)) { 
			System.out.println("회원가입 진행");
			
			if ("POST".equals(request.getMethod())) { //POST
				request.setCharacterEncoding("UTF-8");
//				System.out.println("한글 테스트:" + request.getParameter("name"));
				
				/* 코드 분리를 위해서 MemberService class를 생성함 */
				int result = memberService.memberJoin(request, response);
				
				if (result != 0) {
					System.out.println("회원가입 성공!!!");
					response.sendRedirect("../index.jsp");
				} else {
					System.out.println("회원가입이 실패했습니다ㅠㅠ");
					response.sendRedirect("./memberJoin.do"); /*  ./ : 현재 위치 */
				}
				
				
				
			} else { //GET
				RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/member/memberJoin.jsp");
				view.forward(request, response);
			}
			
			
			
		} else if ("memberpage.do".equals(path)) {
			System.out.println("myPage 진행");
		} else {
			System.out.println("그 외 나머지");
		}
	}
}
