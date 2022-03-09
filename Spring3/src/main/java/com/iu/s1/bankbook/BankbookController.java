package com.iu.s1.bankbook;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankbook/*")
public class BankbookController {
	//POJO (Plain Old Java Object)
	
	@RequestMapping("bankbookList.do")
	public ModelAndView list(@RequestParam(defaultValue ="1") Integer[] num) {
		System.out.println("bankbook list");
		
		for(Integer i:num) {
			System.out.println("i: "+i);
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/bankbook/bankbookList");
		
		return mv;
	}
	
	
	@RequestMapping("bankbookSelect.do")
	public String select(@RequestParam(defaultValue="1") Integer num, String name, Model model) {
		
		System.out.println("num: " + num);
		System.out.println("name: " + name);
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName("bookName");
		model.addAttribute("dto", bankBookDTO);
		
		return "bankbook/bankbookSelect";
	}
	
	
	@RequestMapping("bankbookInsert.do")
	public String insert(BankBookDTO bankBookDTO) {
		System.out.println(bankBookDTO.getBookName());
		
		System.out.println("insert");
		
		return "redirect:../";
	}
	
}
