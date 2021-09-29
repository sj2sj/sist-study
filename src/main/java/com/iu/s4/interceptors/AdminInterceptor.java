package com.iu.s4.interceptors;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.iu.s4.member.MemberDTO;

@Component
public class AdminInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		//admin인지 아닌지 체크하자!
		MemberDTO memberDTO = (MemberDTO) request.getSession().getAttribute("member");
		
		boolean result = false;
		if (memberDTO != null && memberDTO.getId().equals("admin")) {
			System.out.println("관리자 로그인");
			result = true;
		} else { //관리자가 아니라면
			//1. redirect
//			response.sendRedirect("../member/login");
			//2. forward
			request.setAttribute("msg", "관리자만 가능");
			request.setAttribute("url", "../member/login");
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/common/result.jsp");
			view.forward(request, response);
		}
		
		return result;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DispatcherServlet진입 전");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("view 렌더링 후 (response직전)");
	}
	
	
	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("비동기 요청(ajax) 시 postHandle과 afterCompletion를 수행하지 않고 이 메서드를 실행");
	}
	
}
