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
import com.iu.s4.board.CommentsDTO;
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
	
	
	@PostMapping("fileDelete")
	public ModelAndView setFileDelete(BoardFileDTO boardFileDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		int result = noticeService.setFileDelete(boardFileDTO);
		
		mv.addObject("result", result);
		mv.setViewName("common/ajaxResult");
		
		return mv;
	}
	
	
	@GetMapping("update")
	public ModelAndView setUpdate(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		boardDTO = noticeService.getSelect(boardDTO);
		
		mv.addObject("dto", boardDTO);
		mv.setViewName("board/update");
		
		return mv;
	}
	
	
	@PostMapping("setCommentUpdate")
	public ModelAndView setCommentUpdate(CommentsDTO commentsDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		int result = noticeService.setCommentUpdate(commentsDTO);

		
		mv.addObject("result", result);
		mv.setViewName("common/ajaxResult");
		return mv;
	}
	
	
	@GetMapping("setCommentDelete")
	public ModelAndView setCommentDelete(CommentsDTO commentsDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		int result = noticeService.setCommentDelete(commentsDTO);
		
		System.out.println(commentsDTO.getCommentNum());
		
		mv.addObject("result", result);
		mv.setViewName("common/ajaxResult");
		return mv;
	}
	
	@GetMapping("getCommentList")
	public ModelAndView getCommentList(CommentsDTO commentsDTO, Pager pager) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		commentsDTO.setBoard("N");
//		commentsDTO.setNum(boardDTO.getNum());
		List<CommentsDTO> ar = noticeService.getCommentList(commentsDTO, pager);
		
		mv.addObject("comments", ar);
		mv.addObject("pager", pager);
		mv.setViewName("common/ajaxList");
		return mv;
	}
	

	@PostMapping("comment")
	public ModelAndView setComment(CommentsDTO commentsDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		//여기로 들어오는 요청은 무조건 notice이기 때문에 N을 넣어줌
		commentsDTO.setBoard("N");
		
		int result = noticeService.setComment(commentsDTO);
		
		mv.setViewName("common/ajaxResult");
		mv.addObject("result", result);
		return mv;
	}
	
	
	@GetMapping("down")
	public ModelAndView fileDown(BoardFileDTO boardFileDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("dto", boardFileDTO);
		mv.setViewName("fileDown");
		return mv;
	}
	
	
	@GetMapping("select")
	public ModelAndView getSelect(BoardDTO boardDTO, Pager pager) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		boardDTO = noticeService.getSelect(boardDTO);
		List<BoardFileDTO> ar = noticeService.getFile(boardDTO);
		
		CommentsDTO commentsDTO = new CommentsDTO();
		
		commentsDTO.setBoard("N");
		commentsDTO.setNum(boardDTO.getNum());
		
//		List<CommentsDTO> cmList = noticeService.getCommentList(commentsDTO);
		
		
		mv.addObject("dto", boardDTO);
//		mv.addObject("cmList", cmList);

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
