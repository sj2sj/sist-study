package com.iu.s2.random;

import java.util.*;
import java.util.Random;

public class Lotto {

	/*
	 * makeLotto()
	 * 1~45 사이의 번호를 랜덤으로 6개 생성 // 단, 중복X
	 * list에 추가하여 return
	 */
	public HashSet<Integer> makeLotto() {
		
		Random random = new Random();

		HashSet<Integer> randomList = new HashSet<>();
		
		int count = 0;
		
		//set은 중복값을 허용하지 않으므로 set의 size가 6이 될 때까지 반복.
		while (randomList.size() < 6) {
			int r = random.nextInt(46)+1;
			randomList.add(r);
			count++;
		}

		return randomList;
	}
}
