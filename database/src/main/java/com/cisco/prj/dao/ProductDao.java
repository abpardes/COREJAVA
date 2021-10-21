package com.cisco.prj.dao;

import java.util.List;

import com.cisco.prj.entity.Product;

public interface ProductDao {
	void addProduct(Product product) throws DaoException;
	List<Product> getProducts() throws DaoException;
	Product getProduct(int id) throws DaoException;
	void deleteProduct(int id) throws DaoException;
}
