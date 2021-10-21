package com.cisco.prj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cisco.prj.entity.Product;

public class ProductDaoJdbcImpl implements ProductDao {

	@Override
	public void addProduct(Product product) throws DaoException {
		String SQL = "INSERT INTO products( id, name, price, category) VALUES (0, ?, ?, ?)";
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL);
			ps.setString(1, product.getName());
			ps.setDouble(2, product.getPrice());
			ps.setString(3, product.getCategory());
			ps.executeUpdate();
		} catch (SQLException e) {
//			e.printStackTrace();
			if (e.getErrorCode() == 1062) {
				throw new DaoException("product with ID " + product.getId() + " already exists!!", e);
			} else if (e.getErrorCode() == 1205) {
				throw new DaoException("Lock issues");
			}
			throw new DaoException("unable to add product", e);
		} finally {
			DBUtil.closeConnection(con);
		}

	}

	@Override
	public List<Product> getProducts() throws DaoException {
		String SQL = "SELECT id, name, price, category FROM products";
		List<Product> products = new ArrayList<>();
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			while(rs.next()) {
				products.add(new Product(rs.getInt("id"), 
						rs.getString("name"), 
						rs.getDouble("price"), 
						rs.getString("category")));
				
			}
		} catch (SQLException e) {
			throw new DaoException("unable to get products", e);
		} finally {
			DBUtil.closeConnection(con);
		}
		return products;
	}

	@Override
	public Product getProduct(int id) throws DaoException {
		return null;
	}

	@Override
	public void deleteProduct(int id) throws DaoException {

	}

}
