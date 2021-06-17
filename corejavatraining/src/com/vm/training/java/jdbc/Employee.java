package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class Employee {

	private int empid;
	private String empname;
	private String lob;
	private int salary;
	private int age;
	public Employee() {
		super();
	}
	
	public Employee(int empid, String empname, String lob, int salary, int age) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.lob = lob;
		this.salary = salary;
		this.age = age;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getLob() {
		return lob;
	}
	public void setLob(String lob) {
		this.lob = lob;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", lob=" + lob + ", salary=" + salary + ", age="
				+ age + "]";
	}
	
	
	
}