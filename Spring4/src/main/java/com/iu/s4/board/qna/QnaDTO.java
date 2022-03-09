package com.iu.s4.board.qna;

import java.util.List;

import com.iu.s4.board.BoardDTO;
import com.iu.s4.board.BoardFileDTO;

public class QnaDTO extends BoardDTO {

	private Long ref;
	private Long step;
	private Long depth;
	
	private List<BoardFileDTO> files;
	
	
	
	public List<BoardFileDTO> getFiles() {
		return files;
	}
	public void setFiles(List<BoardFileDTO> files) {
		this.files = files;
	}
	public Long getRef() {
		return ref;
	}
	public void setRef(Long ref) {
		this.ref = ref;
	}
	public Long getStep() {
		return step;
	}
	public void setStep(Long step) {
		this.step = step;
	}
	public Long getDepth() {
		return depth;
	}
	public void setDepth(Long depth) {
		this.depth = depth;
	}
	
	
}
