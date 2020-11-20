package com.tcs.ecomm;

import java.util.Optional;

import com.tcs.ecomm.dao.productDAO;
import com.tcs.ecomm.dao.productDAOimpl;
import com.tcs.ecomm.model.product;
import com.tcs.ecomm.service.productService;
import com.tcs.ecomm.service.productServiceimpl;

public class main {
	
	public static void main(String[] args) {
		product p = new product(1, "laptop", "MACBOOK", 1599.0f, "Laptops");
		
		productService prodserv = productServiceimpl.getInstance();
		
		String result = prodserv.createProduct(p);
		
		
		if("success".equals(result)) {
			System.out.println("Record added successfully!!!");
		}
		else {
			System.out.println("Error! Please re-check!");
		}
		
		Optional<product> optional = prodserv.getProductById(1);
		
		
		if(optional.isPresent()) {
			product p2 = optional.get();
			
			System.out.println(p2);
		}
		else {
			System.out.println("Product not available!");
		}
		
		
		
		
	}

}
