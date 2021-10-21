package com.cisco.prj.client;

import com.cisco.prj.dao.DaoException;
import com.cisco.prj.dao.ProductDao;
import com.cisco.prj.dao.ProductDaoJdbcImpl;
import com.cisco.prj.entity.Product;

public class InsertProductExample {

	public static void main(String[] args) {
		Product p = new Product(0, "Hp Laptop", 135000.00, "computer");
		ProductDao productDao = new ProductDaoJdbcImpl();
		try {
			productDao.addProduct(p);
			System.out.println("product added!!!");
		} catch (DaoException e) {
			e.printStackTrace(); // develoment mode
//			System.out.println(e.getMessage()); // production mode
		}
	}

}
