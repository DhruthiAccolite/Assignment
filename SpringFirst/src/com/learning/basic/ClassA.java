package com.learning.basic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ClassA implements BeanPostProcessor{

//	public ClassA() {
//		
//	}
	//ClassBInterface b = new ClassB();
	ClassBInterface b;
public ClassBInterface getB() {
		return b;
	}

	@Autowired
	public void setB(ClassBInterface b) {
		this.b = b;
	}
	//	public ClassA(ClassBInterface b){
//		this.b=b;
//	}
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("Mathod A");
		b.methodB();

	}
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization");
		return null;
	}
	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization");
		return null;
	}
}
