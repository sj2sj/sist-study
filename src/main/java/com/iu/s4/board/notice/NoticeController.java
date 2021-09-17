package com.iu.s4.board.notice;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s4.board.BoardDTO;
import com.iu.s4.board.BoardFileDTO;
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

	
	@GetMapping("down")
	public ModelAndView fileDown(BoardFileDTO boardFileDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("dto", boardFileDTO);
		mv.setViewName("fileDown");
		return mv;
	}
	
	
	@GetMapping("select")
	public ModelAndView getSelect(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		boardDTO = noticeService.getSelect(boardDTO);
		List<BoardFileDTO> ar = noticeService.getFile(boardDTO);
		
		mv.addObject("dto", boardDTO);
//		mv.addObject("fileList", ar);
		mv.setViewName("/board/select");
		
		return mv;
	}
	
	
	
	@GetMapping("insert")
	public ModelAndView setInsert() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/board/insert");
		
		return mv;
	}
	
	@PostMapping("insert")
	public ModelAndView setInsert(BoardDTO boardDTO, MultipartFile[] files) throws Exception {
		//original file name 출력
		for (MultipartFile f : files) {
			System.out.println(f.getOriginalFilename());
		}
		
		ModelAndView mv = new ModelAndView();
		
		
		int result = noticeService.setInsert(boardDTO, files);
		mv.setViewName("redirect:./list");
		
		return mv;
	}
	
	@GetMapping("delete")
	public ModelAndView setDelete(BoardDTO boardDTO) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setDelete(boardDTO);
		
		String message = "Delete Fail";
		if (result > 0) {
			message = "Delete Success";
		}
		
		mv.addObject("msg", message);
		mv.addObject("url", "./list");
		
		mv.setViewName("common/result");
		return mv;
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
