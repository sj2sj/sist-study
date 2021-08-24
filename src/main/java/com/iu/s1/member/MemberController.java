package com.iu.s1.member;

import javax.servlet.http.HttpServletRequest;

public class MemberController {

	public void start(HttpServletRequest request) {
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
		} else if ("memberjoin.do".equals(path)) {
			System.out.println("회원가입 진행");
		} else if ("memberpage.do".equals(path)) {
			System.out.println("myPage 진행");
		} else {
			System.out.println("그 외 나머지");
		}
	}
}
