package com.learning.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassC implements ClassCInterface {
	public static void main(String[] args) {
		

		
			ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
			ClassCInterface c=(ClassCInterface) context.getBean("g");
			
			((ConfigurableApplicationContext)context).close();
		}

	@Override
	public void methodC() {
	System.out.println("IN Methpd C");
		
	}
	}

