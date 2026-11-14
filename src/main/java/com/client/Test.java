package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.SpringConfig;
import com.model.Student;

public class Test { 

	public static void main(String[] args) {
			
		//IOC container
		ApplicationContext ap = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student st = ap.getBean("student",Student.class);
		st.display();
	}
}
 