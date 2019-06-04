package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Project1Application.class, args);
		//Following: we are accessing employee bean 2 times. By default, bean scope is singleton, so only 1 instance of Employee will be created. But if bean scope is prototype, new instance will be created every time the bean is accessed. 
		Employee emp = context.getBean(Employee.class);
		emp.show();
		Employee emp1 = context.getBean(Employee.class);
		emp1.show();
		
		//Following works with beans.xml file in classpath
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Employee emp = context.getBean(Employee.class);
//		Employee emp = context.getBean("employee", Employee.class);
//		emp.show();
	}

}
