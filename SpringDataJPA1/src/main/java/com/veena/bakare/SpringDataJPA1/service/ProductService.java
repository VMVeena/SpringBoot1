package com.veena.bakare.SpringDataJPA1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veena.bakare.SpringDataJPA1.entity.Product;
import com.veena.bakare.SpringDataJPA1.repository.IProductRepo;


@Service
public class ProductService implements IProductService{

	@Autowired
	IProductRepo repo;
	
	
	@Override
	public String SaveProduct(Product product) {
		
		repo.save(product);
		return "Product is added to the list";
	}

	@Override
	public Iterable<Product> SaveAllProduct(Iterable<Product> products){
	//public String SaveAllProduct(Iterable<Product> products){
		
		return repo.saveAll(products);
		//repo.saveAll(products);
		//return "All Products are added to the list";
	}

	@Override
	public Product getProductByID(Integer id) {
		Optional<Product> opt=repo.findById(id);
		if(opt.isPresent())
		{
		Product p=opt.get();
		return p;
		}
		else
		{
			return new Product();

		}
			}
	
	public Iterable<Product> getAllProductsByIDs(Iterable<Integer> ids)
	{
		return repo.findAllById(ids);
		
		
	}

	@Override
	public Boolean isProductAvailable(Integer id) {
		return repo.existsById(id);
		
	}

}
