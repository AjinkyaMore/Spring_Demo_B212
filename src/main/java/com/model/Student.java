package com.model;

import org.springframework.stereotype.Component;

@Component  
public class Student {
 
	public Student() {
		System.out.println("Student constructor called....!!");
	}
	
	public void display() {
		System.out.println("display() method....!!");
	}
}
