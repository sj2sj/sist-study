package com.iu.b5.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRepository {
	
	//해당 id 존재여부 check 
	public Integer getIdCheck(MemberVO memberVO) throws Exception;
	
	//로그인
	public MemberVO getLogin(MemberVO memberVO) throws Exception;
	
	//회원가입
	public int setInsert(MemberVO memberVO) throws Exception;
	
	//회원 파일
	public int setFileInsert(MemberFilesVO memberFilesVO) throws Exception;
}
