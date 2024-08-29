package com.codinghub.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 
		    ApplicationContext  context = new AnnotationConfigApplicationContext(Configaration.class);
		    	
		  Products a1 = context.getBean(Products.class);
		  System.out.println(a1);
		   
	}

}
