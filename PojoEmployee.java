package com.demo.EmployeeModularApproach;

public class PojoEmployee {
	private int id;
	private String name;
	
	public PojoEmployee() {
		// TODO Auto-generated constructor stub
	}
	public void Pojoemployee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}

}
