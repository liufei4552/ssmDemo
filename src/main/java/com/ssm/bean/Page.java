package com.ssm.bean;

public class Page {
	private int page;
	private int pagesize;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Page(int page, int pagesize) {
		super();
		this.page = (page - 1) * pagesize;
		this.pagesize = pagesize;
	}

}
