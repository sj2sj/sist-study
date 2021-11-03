package com.iu.b5.util;

import lombok.Data;

@Data
public class Pager {

	private String kind;
	private String search;
	
	private Integer pn; //페이지 번호
	private Integer perPage; //게시글 몇개씩 보여줄건지
	private Integer startRow; //limit의 시작 번호
	
	public void makeRow() {
		this.startRow = (this.getPn()-1) * this.getPerPage();
	}
	
	public void makeNum(Long totalCount) {
		//전체 페이지 개수 구하기
		Long totalPage = totalCount/this.getPerPage();
		
		if (totalCount % this.getPerPage() != 0) {
			totalPage++;
		}
		
		//총 블럭 개수 구하기
		Long perBlock = 5L;
		Long totalBlock = totalPage/perBlock;
		
		if (totalPage % perBlock != 0) {
			totalBlock++;
		}
		
		//pn으로 현재 블록 번호 구하기
		Long curBlock = this.getPn() / perBlock;
		if (this.getPn() % perBlock != 0) {
			curBlock++;
		}
		
		//curBlock으로 시작번호, 끝번호 구하기
		Long startNum = (curBlock-1) * perBlock + 1;
		Long lastNum = curBlock * perBlock;
		
		System.out.println("시작번호: " + startNum);
		System.out.println("끝번호: " + lastNum);
		
	}
	
	
	/*      setter, getter       */
	public Integer getPn() {
		if (this.pn == null || this.pn < 0) {
			this.pn = 1;
		}
		return this.pn;
	}
	
	public Integer getPerPage() {
		if (this.perPage == null || this.perPage < 0) {
			this.perPage = 10;
		}
		return this.perPage;
	}
	
	public String getSearch() {
		if (this.search == null) {
			this.search = "";
		}
		return this.search;
	}
}
