package com.iu.b5.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import com.iu.b5.util.FileManager;


@Service
@Transactional(rollbackFor = Exception.class)
public class MemberService {

	@Autowired
	private FileManager fileManager;
	
	@Autowired
	private MemberRepository memberRepository;
	
	//중복 아이디인지 체크 
	public boolean memberIdCheck(MemberVO memberVO, BindingResult bindingResult) throws Exception {
		boolean check = false;
		//1. Annotation 검증
		check = bindingResult.hasErrors();
		
		
		if (memberRepository.getIdCheck(memberVO) > 0) {
			System.out.println("중복된 아이디");
			bindingResult.rejectValue("id", "member.id.equals");
			check = true;
		}
		
		return check;
	}
	
	
	//검증 메서드 선언! (비번-비번재확인 맞는지 확인)
	public boolean memberPwError(MemberVO memberVO, BindingResult bindingResult) throws Exception {
		boolean check = false;
		
		//false : 검증 성공
		
		//true : 검증 실패 (위반이 있음.)
		
		//1. Annotation 검증
		check = bindingResult.hasErrors();
		
		//2. password가 일치하는지 검증 (개발자가 직접 만들기)
		if (!(memberVO.getPw().equals(memberVO.getPwCheck()))) {
			bindingResult.rejectValue("pwCheck", "member.password.notEqual");
			check = true;
		}
		
		
		return check;
	}
	
	
	//로그인
	public MemberVO getLogin(MemberVO memberVO) throws Exception {
		return memberRepository.getLogin(memberVO);
	}
	
	
	//회원가입
	public int setInsert(MemberVO memberVO, MultipartFile mfFile) throws Exception {
		
		System.out.println("id:"+memberVO.getId());
		
		int result = memberRepository.setInsert(memberVO); //회원가입
		
		if (!mfFile.isEmpty()) {
			MemberFilesVO memberFilesVO = new MemberFilesVO();
			memberFilesVO.setMember_id(memberVO.getId());
			
			String fileName = fileManager.getUseServletContext("/upload/member", mfFile);
			
			memberFilesVO.setFileName(fileName);
			memberFilesVO.setOriName(mfFile.getOriginalFilename());
			
			result = memberRepository.setFileInsert(memberFilesVO);
		}
		
		
		return result;
	}
	
}
