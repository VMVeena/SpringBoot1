package com.veena.JDBCRawandSpringBoot;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.veena.JDBCRawandSpringBoot.veena.entity.Employee;
import com.veena.JDBCRawandSpringBoot.veena.repository.IEmployeeRepo;

@SpringBootApplication
public class JdbcRawandSpringBootApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	container=SpringApplication.run(JdbcRawandSpringBootApplication.class, args);
	IEmployeeRepo empObj=container.getBean(IEmployeeRepo.class);
	List<Employee> list=empObj.getEmployeeInfo();
	Iterator<Employee> itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	/*for(Employee n:itr) {
		System.out.println(n);
	} */
	}

}
