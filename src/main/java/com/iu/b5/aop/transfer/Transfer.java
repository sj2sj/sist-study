package com.iu.b5.aop.transfer;

import org.springframework.stereotype.Component;

@Component
public class Transfer {

	public void takeBus() {
		System.out.println("bus ----");
	}
	
	
	public void takeSubway() {
		System.out.println("subway ----");
	}
	
}
