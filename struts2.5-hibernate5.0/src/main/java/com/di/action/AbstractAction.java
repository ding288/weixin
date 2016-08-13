package com.di.action;

import com.di.service.AbstractService;
import com.opensymphony.xwork2.ActionContext;

public abstract class AbstractAction<T> {
	private int pageNum;
	private int pageSize;

	public String list() {
		ActionContext ac = ActionContext.getContext();
		ac.put("list", getAbstractService().findAll(pageNum, pageSize));
		return "list";
	}

	public abstract AbstractService<T> getAbstractService();

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
