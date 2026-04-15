package com.veena.bakare.SpringDataJPA1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.veena.bakare.SpringDataJPA1.entity.Product;
import com.veena.bakare.SpringDataJPA1.service.IProductService;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpa1Application.class, args);
		IProductService pd=container.getBean(IProductService.class);
		//Product p1=new Product("Watch","Fashion",2000.0,20);
		//System.out.println(pd.SaveProduct(p1));
		/*
		List<Product> products=new ArrayList<Product>();
		
		Product p2=new Product("Shirt","Fabric",1000.0,10);
		Product p3=new Product("Mobile","Electronic",50000.0,40);
		Product p4=new Product("Book","Stationary",50000.0,600);
		Product p5=new Product("Pen","Stationary",50000.0,40);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		pd.SaveAllProduct(products).forEach(n->System.out.println(n));
		//System.out.println(pd.SaveAllProduct(products)); */
		
		//System.out.println("The product details by id is :"+pd.getProductByID(302));
		
		//List<Integer> ids=Arrays.asList(304,305);
		//Iterable<Product> pdsbyids=pd.getAllProductsByIDs(ids);
		//System.out.println("Products by ids="+pdsbyids);
		//pd.getAllProductsByIDs(ids).forEach(n->System.out.println(n));
		
		/*Boolean status=pd.isProductAvailable(304);
		if (status==true)
		{
			System.out.println("Product is available");
		}
		else
			System.out.println("Product is not available");
			*/
		//System.out.println(pd.deleteProductById(304));
		List<Integer> ids=Arrays.asList(305,4,1);
		String status=pd.deleteProductsByIds(ids);
	     System.out.println(status);
		
		
	}

}
