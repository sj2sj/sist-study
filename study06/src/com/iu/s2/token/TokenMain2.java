package com.iu.s2.token;

import java.util.StringTokenizer;

public class TokenMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * 나라별로 파싱한 후,
		 * 모든 나라 이름은 대문자로 출력하라.
		 * */

		String str = "korea-USA-china*france*UK-canada-germany";
		
		//섞여있는 구분자를 하나로 통일
		str = str.replace("*", "-");
		
		StringTokenizer st = new StringTokenizer(str, "-");
		while (st.hasMoreTokens()) {
			String s = st.nextToken().toUpperCase();
			System.out.println(s);
		}
		
	}

}
