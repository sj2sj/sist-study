package com.iu.b5.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.iu.b5.member.MemberVO;

@Component
public class NoticeInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Controller 진입 전");
		
		MemberVO memberVO = (MemberVO) request.getSession().getAttribute("member");
		
		boolean roleCheck = false;
		
		if (memberVO != null && memberVO.getRole().equals("A")) {
			roleCheck = true;
		} else { //어드민 아니면
			request.setAttribute("msg", "관리자만 접근 가능합니다.");
			request.setAttribute("path", "./list");
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
			view.forward(request, response);
		}

				
		return roleCheck;
	}
	
}
