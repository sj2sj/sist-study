package com.iu.s4.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s4.board.BoardDTO;
import com.iu.s4.board.util.Pager;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	
	@ModelAttribute("board")
	public String getBoard() {
		return "notice";
	}

//	@RequestMapping(value = "list", method = RequestMethod.GET)
	@GetMapping("list")
	public ModelAndView getList(Pager pager) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		List<BoardDTO> ar = noticeService.getList(pager);
		
		mv.setViewName("/board/list");
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		
		return mv;
	}
	
}
