package com.example.test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")//will create new employee instance every time it is accessed
public class Employee {

    private int id;
    private String name;
    private int age;
    private long salary;

    public Employee() {
    	System.out.println("Employee object created...!");
    }
    
    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }

	public void show() {
		System.out.println("this is test...!");		
	}

}