package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mode.Student;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext act=new ClassPathXmlApplicationContext("beans.xml");
		Object o=act.getBean("s");
		Student s=(Student)o;
		System.out.println(s.getName());
		System.out.println(s.getAddress().getlAdd());
		System.out.println(s.getAddress().getpAdd());
		
	}

}
