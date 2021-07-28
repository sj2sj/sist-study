package com.iu.s2.map;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	
		hashMap.put("n1", 3);
		hashMap.put("n2", 6);
		
		hashMap.put("n1", 200); //중복을 허용하지 않기 때문에 n1이라는 key에 200이라는 값으로 들어감 (수정)
		hashMap.put("n3", 6); //value는 중복되도 상관없음.
		
		Iterator<String> keys = hashMap.keySet().iterator();
		
		while(keys.hasNext()) {
			String key = keys.next();
			Integer num = hashMap.get(key);
			System.out.println(num);
		}
		
		System.out.println(hashMap.get("n1"));
		System.out.println(hashMap);
	}

}
