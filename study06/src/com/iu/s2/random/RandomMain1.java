package com.iu.s2.random;

import java.util.*;

public class RandomMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Lotto lotto = new Lotto();
		HashSet<Integer> ar = lotto.makeLotto();
		
		Iterator<Integer> it = ar.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
