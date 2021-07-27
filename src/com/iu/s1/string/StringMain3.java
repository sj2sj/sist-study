package com.iu.s1.string;

public class StringMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "hello world";
		
		//해당 문자를 찾아서 index를 return 
		//System.out.println(test.indexOf('w'));
		
		
		

		char ch = 'o'; 
		// 'o' 문자가 몇개 있습니까?
		int count = 0;
		int num = 0;
		
		while (true) {
			num = test.indexOf(ch, num);
			
			if (num > 0) {
				count++;
				num = num+1;
			} else {
				System.out.println("더 이상 찾을 문자가 없습니다. 검색이 종료됩니다. ");
				break;
			}
		}
		
		System.out.println("개수: " + count);
	}

}
