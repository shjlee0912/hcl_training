package com.hcl.ProjectMaven;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//POJO => Plain Old Java Object
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private int id;
	private String name;
	private String address;
	
}
