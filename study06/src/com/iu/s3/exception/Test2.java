package com.iu.s3.exception;

public class Test2 {

	public void t2(int[] nums) throws ArrayIndexOutOfBoundsException, Exception {

		System.out.println(nums.length);
		
		//예외 발생 시 이 코드가 실행됨
//		thorw new NullPointerException();
		//위와 같이 던질테니 받아서 써라..
		
		System.out.println(nums[4]);

	}
	
}
