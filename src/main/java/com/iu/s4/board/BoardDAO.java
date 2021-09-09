package com.iu.s4.board;

import java.util.List;

import com.iu.s4.board.util.Pager;

public interface BoardDAO {
	public Long getCount(Pager pager) throws Exception; //글 수 count
	
	public abstract List<BoardDTO> getList(Pager pager) throws Exception; //글 목록
	public abstract BoardDTO getSelect(BoardDTO boardDTO) throws Exception; //글 상세 
	public int setInsert(BoardDTO boardDTO) throws Exception; //글 작성
	public int setDelete(BoardDTO boardDTO) throws Exception; //글 삭제
	public int setUpdate(BoardDTO boardDTO) throws Exception; //글 수 
}
