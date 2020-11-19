package com.tcs.ecomm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class product {
	private int productId;
	private String productName;
	private String description;
	private float price;
	private String category;

}
