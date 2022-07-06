package com.base.emp.add;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.base.emp.emp.Employee;


@Component("add")
public class Address {
	
	@Value("Nellore")
	private String vname;
	@Value("Andhra")
	private String city;
	
	@Autowired
	private Employee employee;

	@Override
	public String toString() {
		return "Address [vname=" + vname + ", city=" + city + ", employee=" + employee + "]";
	}	

}
