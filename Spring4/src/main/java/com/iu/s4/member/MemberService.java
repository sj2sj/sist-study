package com.iu.s4.member;

import java.io.File;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private ServletContext sContext;
	
	public int setDelete(MemberDTO memberDTO) throws Exception {
	
		//어느 폴더에 있니?
		String realPath = sContext.getRealPath("/resources/upload/member/");
		
		// 어느 파일?
		MemberFileDTO memberFileDTO = memberDAO.getMemberFile(memberDTO);
		
		//파일 삭제.
		File file = new File(realPath, memberFileDTO.getFileName());
		file.delete();
		
		return memberDAO.setDelete(memberDTO);
	}
	
	public MemberDTO setUpdate(MemberDTO memberDTO) throws Exception {
		memberDAO.setUpdate(memberDTO);
		return memberDAO.getLogin(memberDTO);
	}
	
	public int setJoin(MemberDTO memberDTO, MultipartFile photo, HttpSession session) throws Exception {
		
		//멤버를 먼저 insert 시킴 (pk)
		int result = memberDAO.setJoin(memberDTO);
		
		if (photo != null) {
			//1. 어느 폴더에 저장?
			// /resources/upload/member
			//2. application(ServletContext) 객체 필요
//			ServletContext sContext = this.session.getServletContext();
			String realPath = sContext.getRealPath("/resources/upload/member/");
			System.out.println("realPath: " + realPath);
			
			//3. 폴더확인
			File file = new File(realPath);
			
			if (!file.exists()) {
				file.mkdirs();
			}
			
			//4. 중복되지 않는 파일 이름으로 생성
			// a. 시간 -> 밀리세컨즈
			// b. uuid
			String fileName = UUID.randomUUID().toString();
			fileName = fileName + "_" + photo.getOriginalFilename();
			
			System.out.println("uuidFileName:"+fileName);
			
			//폴더와 파일명 정보
			file = new File(file, fileName);
			
			
			//5. 폴더에 파일 저장.
			// 1) MultipartFile의 trnasferTo 메서드 사용
			
			photo.transferTo(file);
			
			// 2) Spring의 API FileCopyUtils의 copy static 메서드 사용
//			FileCopyUtils.copy(photo.getBytes(), file);
			
			MemberFileDTO memberFileDTO = new MemberFileDTO();
			memberFileDTO.setId(memberDTO.getId());
			memberFileDTO.setFileName(fileName);
			memberFileDTO.setOriName(photo.getOriginalFilename());
			
			
			
//			return 0;
			result = memberDAO.setFileInsert(memberFileDTO);
		}
		return result;
	}
	
	public MemberFileDTO getMemberFile(MemberDTO memberDTO) throws Exception {
		return memberDAO.getMemberFile(memberDTO);
	}
	
	public MemberDTO getLogin(MemberDTO memberDTO) throws Exception {
		return memberDAO.getLogin(memberDTO);
	}
	
	public MemberDTO getIdCheck(MemberDTO memberDTO) throws Exception {
		return memberDAO.getIdCheck(memberDTO);
	}
}
