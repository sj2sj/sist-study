package com.iu.b5.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iu.b5.board.BoardVO;
import com.iu.b5.board.notice.NoticeVO;
import com.iu.b5.util.Pager;


@Controller
@RequestMapping("/qna/**")
public class QnaController {

	@Autowired
	private QnaService qnaService;
	
	@ModelAttribute("board")
	public String getBoard() {
		return "qna";
	}
	
	//insert
		@GetMapping("insert")
		public String setInsert() throws Exception {
			return "board/insert";
		}
		
		@PostMapping("insert")
		public String setInsert(QnaVO qnaVO) throws Exception {
			int result = qnaService.setInsert(qnaVO);

			return "redirect:./list";

		}

		@GetMapping("update")
		public String setUpdate(QnaVO qnaVO, Model model) throws Exception {
			qnaVO = (QnaVO) qnaService.getSelect(qnaVO);
			model.addAttribute("vo", qnaVO);
			
			return "board/update";
		}
		
		@PostMapping("update")
		public String setUpdate(QnaVO qnaVO) throws Exception {
			int result = qnaService.setUpdate(qnaVO);
			return "redirect:./select?num="+qnaVO.getNum();
		}
		
		@GetMapping("delete")
		public String setDelete(QnaVO qnaVO) throws Exception {
			int result = qnaService.setDelete(qnaVO);
			
			return "redirect:./list";
		}
		
		
		@GetMapping("list")
		public ModelAndView getList(ModelAndView mv, Pager pager) throws Exception {
			List<BoardVO> ar = qnaService.getList(pager);
			
			mv.setViewName("board/list");
			mv.addObject("boardList", ar);
			
			return mv;
		}
		
		@GetMapping("select")
		public ModelAndView getSelect(QnaVO qnaVO) throws Exception {
			ModelAndView mv = new ModelAndView();
			qnaVO = (QnaVO) qnaService.getSelect(qnaVO);
			
			mv.setViewName("board/select");
			mv.addObject("vo", qnaVO);
			return mv;
		}
}
