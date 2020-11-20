package com.tcs.ecomm.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.tcs.ecomm.model.product;
import com.mysql.cj.protocol.Resultset;
import com.tcs.ecomm.utils.DBUtils;

public class productDAOimpl implements productDAO {
	
	private productDAOimpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static productDAO dao;
	
	public static productDAO getInstance() {
		
		if(dao==null) {
			dao = new productDAOimpl();
			return dao;
		}
		return dao;  
	}

	@Override
	public String createProduct(product prod) {
		// TODO Auto-generated method stub
		
		Connection conn = DBUtils.getConnection();
		
		PreparedStatement ps = null;
		
		int res = 0;
		
		String command = "insert into PRODUCT (productId, productName,description,price, category) values (?,?,?,?,?)";
		
		try {
			ps = conn.prepareStatement(command);
			ps.setInt(1, prod.getProductId());
			ps.setString(2, prod.getProductName());
			ps.setString(3,  prod.getDescription());
			ps.setFloat(4, prod.getPrice());
			ps.setString(5, prod.getCategory());
			
			res = ps.executeUpdate();
			
			if (res>0) {
				conn.commit();
				return "Success!";
			}
			else {
				return "Failure!";
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "Failure!";
		}
		
		finally {
			DBUtils.closeConnection(conn);
		}
		
		
	}

	@Override
	public Optional<product> getProductById(int id) {
		// TODO Auto-generated method stub
Connection conn = DBUtils.getConnection();
		
		PreparedStatement ps = null;
		
		ResultSet resultset = null;
		
		String command = "select * from PRODUCT where productId=?";
		
		product prod = null;
		try {
			ps = conn.prepareStatement(command);
			ps.setInt(1, id);
			resultset = ps.executeQuery();
			
			if(resultset.next()) {
				prod = new product();
				prod.setProductId(resultset.getInt("productId"));
				prod.setProductName(resultset.getString("productName"));
				prod.setDescription(resultset.getString("description"));
				prod.setPrice(resultset.getFloat("price"));
				prod.setCategory(resultset.getString("category"));
			}
			
			
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return Optional.empty();
		}
		
		finally {
			DBUtils.closeConnection(conn);
		}
		return Optional.of(prod);
	}

	@Override
	public Optional<List<product>> getProducts() {
		// TODO Auto-generated method stub
		return null; 
	}

	@Override
	public String removeProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<product> updateProduct(int id, product prod) {
		// TODO Auto-generated method stub
		return null;
	}

}
