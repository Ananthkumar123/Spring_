package com.codinghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext  context = new ClassPathXmlApplicationContext("com/spring/Codinghub_annotations/Config.xml");
		ApplicationContext  context =new AnnotationConfigApplicationContext(Configaration_01.class);
		
	}

}
