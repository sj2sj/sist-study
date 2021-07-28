package com.iu.s2.list.ex1;

import java.util.HashMap;

public class MemberSession {
	
	public static final HashMap<String, MemberDTO> SESSION;
	
	static { //상수 초기화를 위한 초기화 블럭
		SESSION = new HashMap<String, MemberDTO>();
	}
}
