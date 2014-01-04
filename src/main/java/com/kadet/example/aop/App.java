package com.kadet.example.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kadet.example.aop.services.CustomerService;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext
                = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		CustomerService customer = (CustomerService) appContext.getBean("customerService");
		customer.addCustomer();
		
		customer.addCustomerReturnValue();
		
		customer.addCustomerAround("kadet");

        try{

            customer.addCustomerThrowException();

        } catch (Exception e) {

            System.out.println("my error");

        }

	}
}