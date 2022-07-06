package com.base.emp.emp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	@Value("101")
	private Integer id;
	@Value("Shalini")
	private String ename;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + "]";
	}

}
