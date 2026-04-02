package com.veena.JDBCRawandSpringBoot.veena.entity;

public class Employee {

	private String name;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", id=" + id + "]";
	}
	private String city;
	private Integer id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
