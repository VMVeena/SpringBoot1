package com.veena.bakare.PagingSortingRepository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.veena.bakare.PagingSortingRepository.entity.Product;
import com.veena.bakare.PagingSortingRepository.repo.IProductRepo;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProductRepo  repo;

	@Override
	public Iterable<Product> fetchProductInfoSorting(boolean status, String... properties) {
		Sort sort=Sort.by(status?Direction.ASC:Direction.DESC, properties);
		
		return repo.findAll(sort);
		
	}

	@Override
	public Iterable<Product> fetchProductByPagination(int pgNo, int pgSize, boolean status, String... properties) {
		Sort sort=Sort.by(status?Direction.ASC:Direction.DESC, properties);
		PageRequest pageable=PageRequest.of(pgNo, pgSize, sort);
		Page<Product> page= repo.findAll(pageable);
		return page.getContent();
		
	}
	
	}
