package com.cisco.prj.client;

import com.cisco.prj.entity.Book;
import com.cisco.prj.entity.Product;
import com.cisco.prj.util.SQLUtil;

public class SQLClient {

	public static void main(String[] args) {
		String SQL = SQLUtil.generateCreateSQL(Book.class);
		System.out.println(SQL);
		SQL = SQLUtil.generateCreateSQL(Product.class);
		System.out.println(SQL);
	}

}
