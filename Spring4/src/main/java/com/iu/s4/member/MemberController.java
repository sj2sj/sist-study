package com.iu.s4.member;

import java.net.http.HttpRequest;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping("delete")
	public ModelAndView delete(HttpSession session) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("member");
		int result = memberService.setDelete(memberDTO);
		
		if (result > 0) {
			session.invalidate();
		}
		mv.setViewName("redirect:../");
		
		return mv;
	}
	
	
	@GetMapping("delete")
	public ModelAndView delete() throws Exception {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("member/delete");
		return mv;
	}
	
	
	@PostMapping("update")
	public ModelAndView update(MemberDTO memberDTO, HttpSession session) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		memberDTO = memberService.setUpdate(memberDTO);
		
		session.setAttribute("member", memberDTO);
		
		mv.setViewName("redirect:./mypage");
		
		return mv;
	}
	
	
	@GetMapping("update")
	public ModelAndView update() throws Exception {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("member/update");
		return mv;
	}
	
	
	@GetMapping("mypage")
	public ModelAndView mypage(HttpSession session) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");

		MemberFileDTO memberFileDTO = memberService.getMemberFile(memberDTO);
		
		System.out.println(memberFileDTO.getFileName());
		
//		mv.addObject("file", memberFileDTO);
		mv.setViewName("member/mypage");
		
		return mv;
	}
	
	
	
	@GetMapping("logout")
	public ModelAndView logout(HttpSession session) throws Exception {
		
		/* session 없애는 법 */
		//1. session을 지우기
//		session.removeAttribute("member");
		
		//2. 세션 시간을 0으로 만들기. 자주 쓰는 방법
		session.invalidate();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:../");
		
		return mv;
	}
	
	
	@PostMapping("login")
	public ModelAndView login(MemberDTO memberDTO, HttpSession session) throws Exception {
//		HttpSession session = request.getSession();
		
		
		ModelAndView mv = new ModelAndView();
		memberDTO = memberService.getLogin(memberDTO);
		
		if (memberDTO != null) {
			System.out.println("로그인 성공");
			session.setAttribute("member", memberDTO);
		} else {
			System.out.println("로그인 실패");
			
		}
		
		mv.setViewName("redirect:../");
		
		
		return mv;
	}
	
	@GetMapping("login")
	public ModelAndView login() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/login");
		
		return mv;
	}

	@GetMapping("idCheckAjax")
	public ModelAndView getIdCheckAjax(MemberDTO memberDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		//중복검사할 아이디를 출력
//		System.out.println("id: " + memberDTO.getId());
		
		
		memberDTO = memberService.getIdCheck(memberDTO);
		
		//1: 사용가능 
		//0: 중복 (사용불가능)
		
		int result = 0;
		if (memberDTO == null) {
			result = 1;
		}
		
		mv.addObject("result", result);
		mv.setViewName("common/ajaxResult");
		return mv;
	}
	
	
	@GetMapping("idCheck")
	public ModelAndView getIdCheck(MemberDTO memberDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		memberDTO = memberService.getIdCheck(memberDTO);
		
		mv.addObject("dto", memberDTO);
		mv.setViewName("member/idCheck");
		
		return mv;
	}
	
	@GetMapping("check")
	public ModelAndView check() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/check");
		
		return mv;
	}
	
	
	@GetMapping("join")
	public ModelAndView join() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/join");
		
		return mv;
	}
	
	
	@PostMapping("join")
	public ModelAndView join(MemberDTO memberDTO, MultipartFile photo, HttpSession session) throws Exception {
//		
//		String original = photo.getOriginalFilename();
//		System.out.println("original: " + original);
//		
//		System.out.println("getBytes: " + photo.getBytes());
//		System.out.println("getContentType: " + photo.getContentType());
//		System.out.println("getInputStream:" + photo.getInputStream());
//		System.out.println("getName:" + photo.getName());
//		System.out.println("getSize:" + photo.getSize());
		
		ModelAndView mv = new ModelAndView();
		
//		int result = memberService.setJoin(memberDTO);
		int result = memberService.setJoin(memberDTO, photo, session);
//		int result = 0;
		
		String message = "회원가입 실패";
		if (result > 0) {
			message = "회원가입 성공";
		}
		
		mv.addObject("msg", message);
		mv.addObject("url", "../");
		mv.setViewName("common/result");
		
		
		return mv;
	}
}
