package com.iu.s4.board.notice;

import java.util.List;

import com.iu.s4.board.BoardDTO;
import com.iu.s4.board.BoardFileDTO;

public class NoticeDTO extends BoardDTO {

	private List<BoardFileDTO> files;

	public List<BoardFileDTO> getFiles() {
		return files;
	}

	public void setFiles(List<BoardFileDTO> files) {
		this.files = files;
	}
	
	
	
}
