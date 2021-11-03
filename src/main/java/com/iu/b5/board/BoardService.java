package com.iu.b5.board;

import java.util.List;

import com.iu.b5.util.Pager;

public interface BoardService {

	// 글 쓰기
		public int setInsert(BoardVO boardVO) throws Exception;
		
		// 글 수정
		public int setUpdate(BoardVO boardVO) throws Exception;
		
		// 글 삭제
		public int setDelete(BoardVO boardVO) throws Exception;
		
		// 글 하나 조회
		public BoardVO getSelect(BoardVO boardVO) throws Exception;
		
		//글 리스트 조회
		public List<BoardVO> getList(Pager pager) throws Exception;
	
}
