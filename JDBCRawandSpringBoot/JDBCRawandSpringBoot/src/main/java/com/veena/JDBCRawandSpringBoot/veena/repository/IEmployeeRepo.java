package com.veena.JDBCRawandSpringBoot.veena.repository;
import java.util.List;

import com.veena.JDBCRawandSpringBoot.veena.entity.Employee;

public interface IEmployeeRepo {
	List<Employee> getEmployeeInfo();

}
