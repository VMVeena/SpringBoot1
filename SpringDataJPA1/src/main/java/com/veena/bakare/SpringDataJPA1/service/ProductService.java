package com.veena.bakare.SpringDataJPA1.service;

import java.util.List;
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

	@Override
	public String deleteProductById(Integer id) {
		Optional<Product> p=repo.findById(id);
		if(p.isPresent())
		{
			repo.deleteById(id);
			return "Product is deleted with id: "+id;
		}
		else
			
		return "Product is not present  with given id: "+id+"So Product is not deleted";
	}

	@Override
	public String deleteProductsByIds(List<Integer> ids) {
		List<Product> products = (List<Product>) repo.findAllById(ids);
		if(products.size()!=0)
		{
			repo.deleteAllById(ids);
			return "All Products records with given ids deleted";
		}
		else
		{
			return "Product info with given ids are not in records to delete";
		}
//		if(products.size()==ids.size())
//		{
//			repo.deleteAllById(ids);
//			return "All Products records with given ids deleted";
//		}
//		else
//		{
//			return "Product info with given ids are not in records to delete";
//		}
	}

	}


