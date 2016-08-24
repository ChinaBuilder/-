package com.it.pojo;

import java.io.Serializable;

public class Role implements Serializable {
	private Integer id;
	private String name;
	private String descn;

	public Role() {

	}
	
	public Role(Integer id, String name, String descn) {
		super();
		this.id = id;
		this.name = name;
		this.descn = descn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescn() {
		return descn;
	}

	public void setDescn(String descn) {
		this.descn = descn;
	}

}
