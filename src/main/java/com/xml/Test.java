package com.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		ApplicationContext ap = new ClassPathXmlApplicationContext("com/xmll/beans.xml");
	
		ApplicationContext ap = new FileSystemXmlApplicationContext("D:\\Eclipse_Workspace\\Maven_Workspace_B213\\Spring_Day1\\src\\main\\java\\com\\xml\\beans.xml");
		
	}
}
 