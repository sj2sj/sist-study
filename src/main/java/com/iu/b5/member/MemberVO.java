package com.iu.b5.member;

import lombok.Data;

@Data
public class MemberVO {

	private String id;
	private String pw;
	private String name;
	private String email;
	
	private MemberFilesVO memberFile;
}
