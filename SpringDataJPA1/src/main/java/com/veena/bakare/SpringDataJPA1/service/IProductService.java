package com.veena.bakare.SpringDataJPA1.service;

import java.util.Optional;

import com.veena.bakare.SpringDataJPA1.entity.Product;

public interface IProductService {

	public String SaveProduct(Product product);
	public Iterable<Product> SaveAllProduct(Iterable <Product> products);
	//public String SaveAllProduct(Iterable <Product> products);
	public Product getProductByID(Integer id);
	public Iterable<Product> getAllProductsByIDs(Iterable<Integer> ids);
	public Boolean isProductAvailable(Integer id);
	
	
	
}
