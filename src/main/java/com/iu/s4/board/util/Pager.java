package com.iu.s4.board.util;

public class Pager {

	private Long pn; //현재 페이지
	private Long perPage; //한 페이지에 게시글 몇개 뿌리는지?.
	
	private Long startRow; //게시글 시작번호
	private Long lastRow; //게시글 끝번호
	
	private Long startNum; //페이지 시작번호
	private Long lastNum; //페이지 끝번호
	
	private Long totalPage; //총 페이지 수
	
	/*
	 * pn을 이용해서 보여줄 startRow, lastRow 계산
	 */
	public void makeRow() {
		this.startRow = (this.getPn()-1) * this.getPerPage()+1;
		this.lastRow = this.getPn() * this.getPerPage();
	}
	
	/*
	 * 페이지 계산
	 */
	public void makeNum(Long totalCount) {
		totalPage = totalCount / this.getPerPage();
		
		// 총 페이지 수 계산
		if (totalCount % this.getPerPage() != 0) {
			totalPage++;
		}
		
		// 화면에 몇 페이지씩 보여줄건지?
		Long totalBlock = totalPage / 5;
		if (totalPage % 5 != 0) {
			totalBlock++;
		}
		
		//현재 블록 계산
		if (totalPage < this.getPn()) {
			this.pn = totalPage;
		}
		
		Long curBlock = this.getPn() / 5;
		if (this.getPn() % 5 != 0) {
			curBlock++;
		}
		
		//curBlock으로 시작번호~ 마지막번호 구하기
		this.startNum = (curBlock-1) * 5+1;
		this.lastNum = curBlock * 5;
		
		//현재 선택된 블록이 마지막 블록? -> 마지막 블록 처리해주기!
		if (curBlock == totalBlock) {
			this.lastNum = totalPage;
		}
		
	}

	public Long getPn() {
		if (this.pn == null || this.pn <= 0) {
			this.pn = 1L;
		}
		
		return pn;
	}

	public void setPn(Long pn) {
		this.pn = pn;
	}

	public Long getPerPage() {
		if (this.perPage == null || this.perPage == 0) {
			this.perPage = 10L;
		}
		
		return perPage;
	}

	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}

	public Long getStartRow() {
		return startRow;
	}

	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}

	public Long getLastRow() {
		return lastRow;
	}

	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}

	public Long getStartNum() {
		return startNum;
	}

	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}

	public Long getLastNum() {
		return lastNum;
	}

	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}

	public Long getTotalPage() {
		return totalPage;
	}


	
}
