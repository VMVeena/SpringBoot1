package com.veena.bakare.SpringDataJPA1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.veena.bakare.SpringDataJPA1.entity.Product;


//here spring proxy will implement all the implementation of data base related work. we just need to specify our requirements
@Repository //its not mandatory. We are added this annotation for readability purpose
public interface IProductRepo extends CrudRepository<Product, Integer> {

}
