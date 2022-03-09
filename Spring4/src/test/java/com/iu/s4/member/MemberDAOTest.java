package com.iu.s4.member;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s4.MyJunitTest;

public class MemberDAOTest extends MyJunitTest {

	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void setUpdateTest() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("qqq");
		memberDTO.setPw("qqq1234");
		memberDTO.setName("먀먀먐");
		memberDTO.setPhone("010234912333");
		memberDTO.setEmail("www12@123.com");
		
		int result = memberDAO.setUpdate(memberDTO);
		
		assertEquals(result, 1);
	}
	
//	@Test
	public void setJoinTest() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("qqq123");
		memberDTO.setPw("qqq123");
		memberDTO.setName("먀먀");
		memberDTO.setPhone("01011112333");
		memberDTO.setEmail("qqq123@123.com");
		
		int result = memberDAO.setJoin(memberDTO);
		
		assertEquals(result, 1);
	}
	
	
//	@Test
	public void getIdCheckTest() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("aa");
		memberDTO = memberDAO.getIdCheck(memberDTO);
		
		assertNotNull(memberDTO);
	}

}
