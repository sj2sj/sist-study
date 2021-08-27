package com.iu.s2.token;

import java.util.StringTokenizer;

public class TokenMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "korea-usa-france"; //split 메서드가 편한 경우 
		String[] s = str1.split("-");
		
		Nation[] nations = new Nation[s.length];
		
		//split으로 객체에 데이터 set
		for (int i = 0; i < s.length; i++) {
			Nation n = new Nation();
			n.setName(s[i]);
			nations[i] = n;
		}
		
		//StringTokenizer를 이용한 데이터 set
		StringTokenizer st = new StringTokenizer(str1, "-");
		
		int idx = 0;
		while (st.hasMoreTokens()) {
			String n2 = st.nextToken();
			Nation n = new Nation();
			n.setName(n2);
			nations[idx] = n;
			idx++;
		}
		
		
		//==============================================================
		
		String str2 = "note10-100-iphone12-130-zflip-300"; //StringTokenizer가 편한 경우 
		
		//split으로 객체에 데이터 set
		String[] strs = str2.split("-");
		
		for (int i = 0; i < strs.length; i++) {
			Phone p = new Phone();
			p.setName(strs[i]);
			p.setPrice(strs[++i]);
		}
				
		//StringTokenizer를 이용한 데이터 set
		StringTokenizer st2 = new StringTokenizer(str2, "-");
		System.out.println(st2.countTokens());
		
		while(st2.hasMoreTokens()) {
			Phone p = new Phone();
			//nextToken을 호출 할 때마다 한 번씩 분리됨.
			//nextToken을 2번 호출했기 때문에 while문 한 번 돌때 2번씩 분리되는 것 
			p.setName(st2.nextToken());
			p.setPrice(st2.nextToken());
		}
	}

}
