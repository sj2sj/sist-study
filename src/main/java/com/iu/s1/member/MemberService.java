package com.iu.s1.member;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberService {
	
	private MemberDAO memberDAO = null;

	public MemberService() {
		memberDAO = new MemberDAO();
	}
	
	public int memberJoin(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setId(request.getParameter("id"));
		memberDTO.setPw(request.getParameter("pw"));
		memberDTO.setName(request.getParameter("name"));
		memberDTO.setPhone(request.getParameter("phone"));
		memberDTO.setEmail(request.getParameter("email"));
		
		return memberDAO.memberJoin(memberDTO);
	}
	
	
}
