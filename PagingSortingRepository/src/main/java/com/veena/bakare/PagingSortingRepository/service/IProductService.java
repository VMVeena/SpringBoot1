package com.veena.bakare.PagingSortingRepository.service;

import com.veena.bakare.PagingSortingRepository.entity.Product;

public interface IProductService {

	Iterable<Product> fetchProductInfoSorting(boolean status, String...properties);
	Iterable<Product> fetchProductByPagination(int pgNo,int pgSize,boolean status, String...properties);
	void fetchProductByPagination(int pgSize);
}
