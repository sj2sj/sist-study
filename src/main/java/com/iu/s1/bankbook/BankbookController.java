package com.iu.s1.bankbook;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bankbook/*")
public class BankbookController {
	//POJO (Plain Old Java Object)
	
	@RequestMapping("bankbookList.do")
	public String list() {
		System.out.println("bankbook list");
		
		return "/bankbook/bankbookList";
	}
	
	
	@RequestMapping("bankbookSelect.do")
	public String select(int num, String name) {
		
		System.out.println("num: " + num);
		System.out.println("name: " + name);
		
		return "bankbook/bankbookSelect";
	}
	
}
