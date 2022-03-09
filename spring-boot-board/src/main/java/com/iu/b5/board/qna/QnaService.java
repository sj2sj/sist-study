package com.iu.b5.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.b5.board.BoardService;
import com.iu.b5.board.BoardVO;
import com.iu.b5.util.Pager;

@Service
public class QnaService implements BoardService {
	
	@Autowired
	private QnaRepository qnaRepository;

	
	public int setReplyInsert(BoardVO boardVO, MultipartFile[] files) throws Exception {
		int result = qnaRepository.setRefUpdate(boardVO);
		result = qnaRepository.setReplyInsert(boardVO);
		
		
		//파일 저장 코드 작성
		
		return result;
	}
	
	
	@Override
	public int setInsert(BoardVO boardVO, MultipartFile[] files) throws Exception {
		// TODO Auto-generated method stub
		int result = qnaRepository.setInsert(boardVO);
		
		return qnaRepository.setRefUpdate(boardVO);
	}

	@Override
	public int setUpdate(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return qnaRepository.setUpdate(boardVO);
	}

	@Override
	public int setDelete(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return qnaRepository.setDelete(boardVO);
	}

	@Override
	public BoardVO getSelect(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return qnaRepository.getSelect(boardVO);
	}

	@Override
	public List<BoardVO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		pager.makeRow();
		
		Long totalCount = qnaRepository.getTotalCount(pager);
		pager.makeNum(totalCount);
		
		return qnaRepository.getList(pager);
	}

}
