package com.iu.b5.member;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member/**")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/memberLogin")
	public String getLogin() throws Exception {
		return "member/memberLogin";
	}
	
	
	/*----------------- 로그아웃 -----------------*/
	@GetMapping("/memberLogout")
	public String getLogout(HttpSession session) throws Exception {
		session.invalidate();
		
		return "redirect:/";
	}
	
	/*----------------- 로그인 -----------------*/
	@PostMapping("/memberLogin")
	public String getLogin(MemberVO memberVO, HttpSession session) throws Exception {
		
		memberVO = memberService.getLogin(memberVO);
		
		if (memberVO != null) {
			System.out.println("로그인 ok!");
			session.setAttribute("member", memberVO);
		}

		return "redirect:/";
	}
	
	/*----------------- 회원가입 -----------------*/
	@GetMapping("/memberJoin")
	public String setInsert(@ModelAttribute MemberVO memberVO) throws Exception {
		return "member/memberJoin";
	}
	
	@PostMapping("/memberJoin")
	public String setInsert(@Valid MemberVO memberVO, BindingResult bindingResult, MultipartFile mfFile) throws Exception {

		//id 중복 검증하기
		if (memberService.memberIdCheck(memberVO, bindingResult)) {
			return "member/memberJoin";
		}
		
		//password - password check 검증, 틀렸다면
		if (memberService.memberPwError(memberVO, bindingResult)) {
			return "member/memberJoin";
		}
		

		
		
//		int result = memberService.setInsert(memberVO, mfFile);
		
		return "redirect:/";
	}
	
}
