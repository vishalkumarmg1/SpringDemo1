package com.tcs.ecomm.service;

import java.util.Optional;

import com.tcs.ecomm.dao.productDAO;
import com.tcs.ecomm.dao.productDAOimpl;
import com.tcs.ecomm.model.product;

public class productServiceimpl implements productService {
	
	
	
	
	private static productService prodserv;
	
	private productServiceimpl() {
		
		
	}
	
	public static productService getInstance() {
		if(prodserv == null) {
			prodserv = new productServiceimpl();
			return prodserv;
		}
		
		return prodserv;
	}
	
	productDAO productdao = productDAOimpl.getInstance();
	
	
	@Override
	public String createProduct(product prod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<product> getProductById(int id) {
		// TODO Auto-generated method stub
		return productdao.getProductById(id);
	}

}
