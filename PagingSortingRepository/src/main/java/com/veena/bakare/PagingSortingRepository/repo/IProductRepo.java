package com.veena.bakare.PagingSortingRepository.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.veena.bakare.PagingSortingRepository.entity.Product;

public interface IProductRepo extends PagingAndSortingRepository<Product, Integer> {

}
