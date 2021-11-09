package com.iu.b5.interceptor;

import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.iu.b5.board.BoardVO;
import com.iu.b5.member.MemberVO;

@Component
public class UpdateInterceptor implements HandlerInterceptor {


	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("update InterCeptor postHandle 진입");
		// TODO Auto-generated method stub
		
		// 1. 로그인 유저 꺼내기
		MemberVO memberVO = (MemberVO) request.getSession().getAttribute("member");
		
		// 2. 작성자
		Map<String, Object> model = modelAndView.getModel();
		BoardVO boardVO = (BoardVO) model.get("vo");
		
		
		if (boardVO == null) {
			return ;
		}
		
		if (!(memberVO.getId().equals(boardVO.getWriter()))) {
			request.setAttribute("msg", "게시글 수정은 작성자만 가능합니다.");
			request.setAttribute("path", "./list");
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
			view.forward(request, response);
		}
	}
	
}
