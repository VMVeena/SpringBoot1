package com.veena.JDBCRawandSpringBoot.veena.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.veena.JDBCRawandSpringBoot.veena.entity.Employee;

@Repository
public class EmployeeRepoImpl implements IEmployeeRepo {

	@Autowired
	private DataSource dataSource;
	private ArrayList<Employee> list;
	private static final String sqlQuery="SELECT * FROM Employee";
	Connection con1;
	@Override
	public List<Employee> getEmployeeInfo() {
		
		//spring+ jdbc raw
		try
		{
			
			//register///load is not requreed for new jdbc
			//getconnection
			
		con1=dataSource.getConnection();
			PreparedStatement pstmt=con1.prepareStatement(sqlQuery);
			ResultSet rs=pstmt.executeQuery();
			 
			list=new ArrayList<Employee>();
			while(rs.next())
			{
				Employee emp=new Employee();
				emp.setName(rs.getString(1));
				emp.setCity(rs.getString(2));
				emp.setId(rs.getInt(3));
				list.add(emp);
			}
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try {
				con1.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

}
