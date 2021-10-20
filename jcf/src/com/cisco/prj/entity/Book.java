package com.cisco.prj.entity;

import com.cisco.prj.annotation.Column;
import com.cisco.prj.annotation.Table;

@Table(name="books")
public class Book {
	
	@Column(name="ISBN")
	public String getIsbn() {
		return null;
	}
	
	@Column(name="PRICE", type="double")
	public double getPrice() {
		return 0;
	}
}

