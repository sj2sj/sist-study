package com.iu.b5.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.iu.b5.util.FileManager;


@Service
@Transactional(rollbackFor = Exception.class)
public class MemberService {

	@Autowired
	private FileManager fileManager;
	
	@Autowired
	private MemberRepository memberRepository;
	
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
