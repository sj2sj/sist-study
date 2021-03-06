package com.iu.s4.member;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSession sqlSession;
	

	
	private final String NAMESPACE = "com.iu.s4.member.MemberDAO.";

	
	public int setDelete(MemberDTO memberDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"setDelete", memberDTO);
	}
	
	public int setUpdate(MemberDTO memberDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"setUpdate", memberDTO);
	}
	
	public int setJoin(MemberDTO memberDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setJoin", memberDTO);
	}
	
	public int setFileInsert(MemberFileDTO memberFileDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setFileInsert", memberFileDTO);
	}
	
	public MemberFileDTO getMemberFile(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getMemberFile", memberDTO);
	}
	
	public MemberDTO getLogin(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getLogin", memberDTO);
	}
	
	public MemberDTO getIdCheck(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getIdCheck", memberDTO);
	}
}
