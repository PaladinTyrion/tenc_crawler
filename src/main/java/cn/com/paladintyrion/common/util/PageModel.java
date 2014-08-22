package cn.com.paladintyrion.common.util;

import java.util.List;

public class PageModel {

	private int count;//记录总数
	private int offset;//第几页
	private int pageSize=10;//每页容量
	private int pageCount;//总页数
	private int pageNo;
	
	private List<?> data;//数据

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
		this.pageNo=offset/pageSize+1;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		return pageCount;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
		//把分页算出来
		if(this.pageSize>0)
			this.pageCount=(count%pageSize==0)?(count/pageSize):(count/pageSize+1);
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
}
