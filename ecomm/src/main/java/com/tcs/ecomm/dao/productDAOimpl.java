package com.tcs.ecomm.dao;

import java.util.List;
import java.util.Optional;

import com.tcs.ecomm.model.product;

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
		return null;
	}

	@Override
	public Optional<product> getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
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
