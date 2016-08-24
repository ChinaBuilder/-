package com.it.dto;

import java.util.List;

/**
 * 
 * 
 * @author KAY
 *
 * @param <T>
 */
public class DataTableResult<T> {
	public String draw;
	public List<T> data;
	public Long recordsTotal;
	public Long recordsFiltered;

	public DataTableResult() {

	}

	/**
	 * 
	 * @param draw
	 *           当前页数
	 * @param data
	 *           返回数据
	 * @param recordsTotal
	 *            数据总量
	 * @param recordsFiltered
	 *           经过过滤后数据总量
	 */
	public DataTableResult(String draw, List<T> data, Long recordsTotal, Long recordsFiltered) {
		this.draw = draw;
		this.data = data;
		this.recordsTotal = recordsTotal;
		this.recordsFiltered = recordsFiltered;
	}

	public String getDraw() {
		return draw;
	}

	public void setDraw(String draw) {
		this.draw = draw;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Long getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(Long recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public Long getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(Long recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
	
	
}
