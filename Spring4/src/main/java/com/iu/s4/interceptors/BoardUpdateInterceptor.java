package com.iu.s4.interceptors;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.iu.s4.board.BoardDTO;
import com.iu.s4.member.MemberDTO;

@Component("update")
public class BoardUpdateInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
			
		Map<String, Object> map = modelAndView.getModel();
		
		BoardDTO boardDTO = (BoardDTO)map.get("dto");
		
		//로그인한 정보 꺼내오기
		MemberDTO memberDTO = (MemberDTO) request.getSession().getAttribute("member");
		String id = "";
		
		if (memberDTO != null) {
			id = memberDTO.getId();
		}
		
		
		if (!boardDTO.getWriter().equals(id)) {
			//1. redirect
//			modelAndView.setViewName("redirect:../member/login");
		
			//2. foward
			modelAndView.setViewName("common/result");
			modelAndView.addObject("msg", "글 작성자만 수정 가능합니다..");
			modelAndView.addObject("url", "./list");
		}
	}
	
}
