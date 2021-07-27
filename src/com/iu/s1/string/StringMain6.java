package com.iu.s1.string;

public class StringMain6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String weather = "서울-대구-대전-광주-부산-제주";
		
		String[] citys = weather.split("-");
		
		for (int i = 0; i < citys.length; i++) {
			System.out.println(citys[i]);
		}
		
		
		//
		weather = "32 89 45 67";
		String[] nums = weather.split(" ");
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
		String name = " Te   st          ";
		System.out.println(name.equals("Test"));
		
		//name = name.trim(); //trim은 앞뒤 공백만 제거함
		name = name.replace(" ","");
		System.out.println(name);
		System.out.println(name.equals("Test"));
	}

}
