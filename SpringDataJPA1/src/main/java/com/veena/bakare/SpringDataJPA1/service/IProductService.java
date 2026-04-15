package com.veena.bakare.SpringDataJPA1.service;

import java.util.List;
import java.util.Optional;

import com.veena.bakare.SpringDataJPA1.entity.Product;

public interface IProductService {

	 String SaveProduct(Product product);
	 Iterable<Product> SaveAllProduct(Iterable <Product> products);
	//public String SaveAllProduct(Iterable <Product> products);
     Product getProductByID(Integer id);
	 Iterable<Product> getAllProductsByIDs(Iterable<Integer> ids);
	 Boolean isProductAvailable(Integer id);
	String deleteProductById(Integer id);
	String deleteProductsByIds(List<Integer>ids);

	
}
