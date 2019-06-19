package com.connect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.connect.dao.Customer;


public class Controller {
	
	@Autowired
	Customer c;
public static void main(String[] args) {
	System.out.println(c.viewCustomers());
}
}
