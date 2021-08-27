package com.iu.s1.wrapper;

public class WrapperMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//주민번호 입력
		//991224-1234567
		
		//몇살?
		//3-5: 봄
		//6-8: 여름
		//9-11: 가을
		//12-2: 겨울
		
		String rrn = "971224-1234567";
		
		char gen = rrn.charAt(7);
		
		String sYear = "";
		int year = 0;
		
		if (gen == '1' || gen == '2') { //1990년대생
			sYear = "19"+rrn.substring(0, 2);
		} else if (gen == '3' || gen == '4') {
			sYear = "20"+rrn.substring(0, 2);
		}
		year = Integer.parseInt(sYear);
		
		System.out.println("나이: " + (2021-year+1));
		
		
		String sMonth = rrn.substring(2, 4);
		int month = Integer.parseInt(sMonth);
		
		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}
	}

}
