package com.veena.bakare.PagingSortingRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.veena.bakare.PagingSortingRepository.service.IProductService;


@SpringBootApplication
public class PagingSortingRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(PagingSortingRepositoryApplication.class, args);
		IProductService service=container.getBean(IProductService.class);
		//service.fetchProductInfoSorting(true, "price").forEach(p->System.out.println(p));
		service.fetchProductByPagination(2,2,true, "price").forEach(p->System.out.println(p));
		
	}

}
