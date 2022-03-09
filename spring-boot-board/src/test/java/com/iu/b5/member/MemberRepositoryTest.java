package com.iu.b5.member;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;
	
	//@Test
	void getLoginTest() throws Exception {
		MemberVO memberVO = new MemberVO();
		memberVO.setId("test");
		memberVO.setPw("test2");
		
		memberVO = memberRepository.getLogin(memberVO);
		
		assertNotNull(memberVO);
	}
	
	//@Test
	void setInsertTest() throws Exception {
		MemberVO memberVO = new MemberVO();
		memberVO.setId("test1");
		memberVO.setPw("test1");
		memberVO.setEmail("test1@gmail.com");
		memberVO.setName("test1");
		
		int result = memberRepository.setInsert(memberVO);
		assertEquals(1, result);
	}

//	@Test
	void setFileInsert() throws Exception {
		MemberFilesVO memberFilesVO = new MemberFilesVO();
		memberFilesVO.setFileName("test1");
		memberFilesVO.setOriName("test1");
		memberFilesVO.setMember_id("test1");
		
		int result = memberRepository.setFileInsert(memberFilesVO);
		assertEquals(1, result);
	}

}
