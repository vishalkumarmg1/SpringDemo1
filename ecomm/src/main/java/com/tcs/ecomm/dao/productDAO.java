package com.tcs.ecomm.dao;

import java.util.List;
import java.util.Optional;

import com.tcs.ecomm.model.product;

public interface productDAO {
	
	public String createProduct(product prod);
	
	public Optional<product> getProductById(int id);
	
	public Optional<List<product>> getProducts();
	
	public String removeProduct(int id);
	
	public Optional<product> updateProduct(int id, product prod);

}
