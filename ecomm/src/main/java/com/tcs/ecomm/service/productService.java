package com.tcs.ecomm.service;

import java.util.Optional;


import com.tcs.ecomm.model.product;

public interface productService {
	
	public String createProduct(product prod);
	
	public Optional<product> getProductById(int id);

}
