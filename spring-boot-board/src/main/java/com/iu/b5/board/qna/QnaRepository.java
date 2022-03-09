package com.iu.b5.board.qna;

import org.apache.ibatis.annotations.Mapper;

import com.iu.b5.board.BoardMapper;
import com.iu.b5.board.BoardVO;

@Mapper
public interface QnaRepository extends BoardMapper {
	
	public int setReplyInsert(BoardVO boardVO) throws Exception;
	public int setReplyUpdate(BoardVO boardVO) throws Exception;
	public int setRefUpdate(BoardVO boardVO) throws Exception;
	public int setReplyInsert(QnaVO qnaVO) throws Exception;
	
}
