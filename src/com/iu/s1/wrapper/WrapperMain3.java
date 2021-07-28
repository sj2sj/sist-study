package com.iu.s1.wrapper;


/*
 * 주민등록번호 검증 프로그램
 * 
 */
public class WrapperMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rrn = "941224-1234567";
		
		//  9    7    1    2   2   4    -   1    2   3   4    5   6   : 7은 검사번호
		//* 2    3    4    5   6   7        8    9   2   3    4   5
		//=============================================================
		//1. 18 + 21 + 4  + 10 +12 +28   +   8  + 18 +6  +12  +20+ 30  = 187
		//2.  188을 11로 나누어서 나머지를 구함 (188%11 = 1)
		//3.  11에서 나머지를 빼서 그 값이 주민등록번호 마지막과 일치하면 옳은 주민등록번호
		//3-1. 나머지를 뺐는데 두자리 수가 나오는 경우
		//3.에서 나온 결과를 다시 10으로 나누어서 그 나머지를 구해서 나머지 숫자와 마지막 번호가 일치하면 옳은 주민등록번호
		
		rrn = rrn.replace("-", ""); //주민등록번호에서 - 없애기.

		int[] rrnNum = new int[rrn.length()];
		
		int rrnSum = 0;
		int multiNum = 2; //곱할 수
		
		for (int i = 0; i < rrn.length(); i++) {
			rrnNum[i] = rrn.charAt(i)-48; //아스키 코드 값 0을 빼서 char->int
			
			if (multiNum > 9) {
				multiNum = 2;
			}
			if (i != rrn.length()-1) { //마지막 식별번호 빼고 곱해서 더하기..
				rrnSum += rrnNum[i] * multiNum;
				//System.out.println(rrnNum[i]+"*"+multiNum+"="+rrnNum[i]*multiNum);
				multiNum++;
			}
			
		}
//		System.out.println(rrnSum);
		
		int remainNum = 11-(rrnSum%11);
//		System.out.println(remainNum);

		boolean check = false;
		if (remainNum > 9) {	//두자리 수가 결과로 나오면 
			if (remainNum%10 == rrnNum[rrnNum.length-1]) {
				check = true;
			}
		} else {
			if (remainNum == rrnNum[rrnNum.length-1]) {
				check = true;
			}
		}
		
		if (check) {
			System.out.println("올바른 주민등록번호 입니다.");
		} else {
			System.out.println("주민등록번호가 올바르지 않습니다.");
		}
	}

	
}
