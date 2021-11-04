package com.iu.b5.board.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.b5.board.BoardVO;
import com.iu.b5.util.Pager;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@ModelAttribute("board")
	public String getBoard() {
		return "notice";
	}
	
	//insert
	@GetMapping("insert")
	public String setInsert() throws Exception {
		return "board/insert";
	}
	
	@PostMapping("insert")
	public String setInsert(NoticeVO noticeVO, MultipartFile[] files) throws Exception {
		
		int result = noticeService.setInsert(noticeVO, files);

		return "redirect:./list";

	}

	@GetMapping("update")
	public String setUpdate(NoticeVO noticeVO, Model model) throws Exception {
		noticeVO = (NoticeVO) noticeService.getSelect(noticeVO);
		model.addAttribute("vo", noticeVO);
		
		return "board/update";
	}
	
	@PostMapping("update")
	public String setUpdate(NoticeVO noticeVO) throws Exception {
		int result = noticeService.setUpdate(noticeVO);
		return "redirect:./select?num="+noticeVO.getNum();
	}
	
	@GetMapping("delete")
	public String setDelete(NoticeVO noticeVO) throws Exception {
		int result = noticeService.setDelete(noticeVO);
		
		return "redirect:./list";
	}
	
	
	@GetMapping("list")
	public ModelAndView getList(ModelAndView mv, Pager pager) throws Exception {
		List<BoardVO> ar = noticeService.getList(pager);
		
		mv.setViewName("board/list");
		mv.addObject("boardList", ar);
		mv.addObject("pager", pager);
		
		return mv;
	}
	
	@GetMapping("select")
	public ModelAndView getSelect(NoticeVO noticeVO) throws Exception {
		ModelAndView mv = new ModelAndView();
		noticeVO = (NoticeVO) noticeService.getSelect(noticeVO);
		
		mv.setViewName("board/select");
		mv.addObject("vo", noticeVO);
		return mv;
	}
	
}
