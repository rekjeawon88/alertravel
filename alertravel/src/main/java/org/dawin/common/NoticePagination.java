package org.dawin.common;

public class NoticePagination {
	private int listSize = 10; // 초기값으로 목록개수를 10으로 셋팅
	private int rangeSize = 10; // 초기값으로 페이지범위를 10으로 셋팅
	private int page;   // 현재 목록 페이지 번호
	private int range;  // 각 페이지 범위 시작 번호
	private int listCnt;  // 전체 게시물 갯수 = notice_no
	private int pageCnt; // 전체 페이지 범위 개수
	private int startPage; // 페이지 범위 시작 번호
	private int startList;  //
	private int endPage; // 페이지 범위 끝 번호
	private boolean prev; // 이전페이지 여부
	private boolean next; // 다음페이지 여부

	public int getRangeSize() {
		return rangeSize;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getListSize() {
		return listSize;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}

	public int getListCnt() {
		return listCnt;
	}

	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}

	public int getStartList() {
		return startList;
	}

	public void pageInfo(int page, int range, int listCnt) {
		this.page = page;
		this.range = range;
		this.listCnt = listCnt; 
			

		// 전체 페이지수
		this.pageCnt = (int) Math.ceil((double)listCnt / listSize);
		System.out.println(this.pageCnt);
		
		//시작 페이지				
		this.startPage = (range - 1) * rangeSize + 1 ;
		
		//끝 페이지
		this.endPage = range * rangeSize;
		
		//게시판 시작번호
		this.startList = (page - 1) * listSize;
		
		//이전 버튼 상태
		this.prev = range == 1 ? false : true;
		
		
		//다음 버튼 상태
		this.next = endPage > pageCnt ? false : true;
		if (this.endPage > this.pageCnt) {
			this.endPage = this.pageCnt; 
			this.next = false;
		}
		
	}

}
