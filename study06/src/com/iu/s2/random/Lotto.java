package com.iu.s2.random;

import java.util.*;
import java.util.Random;

public class Lotto {

	/*
	 * makeLotto()
	 * by 내가 만든 것!
	 * 1~45 사이의 번호를 랜덤으로 6개 생성 // 단, 중복X
	 * list에 추가하여 return
	 */
	public HashSet<Integer> makeLotto() {
		
		Random random = new Random();

		HashSet<Integer> randomList = new HashSet<>();
		
		//set은 중복값을 허용하지 않으므로 set의 size가 6이 될 때까지 반복.
		while (randomList.size() < 6) {
			int r = random.nextInt(46)+1;
			randomList.add(r);
		}

		return randomList;
	}
	
	
	
	
	
	
	
	
	
	public int[] makeLotto2() {
		
		int[] nums = new int[6];
		
		Random random = new Random();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(45)+1;
			
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					i--;
				}
			}

		}
		
		return nums;
	}
}
