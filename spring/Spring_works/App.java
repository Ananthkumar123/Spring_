package com.spring.Spring_works;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext  context = new ClassPathXmlApplicationContext("colleage.xml");
//    	System.out.println(context.getBeanDefinitionCount());
    	
//    	poso_1 ps = context.getBean("poso2",poso_1.class);
//    	System.out.println(ps);
    	 
//    	colleage cg =context.getBean(colleage.class);
//    	System.out.println(cg);
//    	
//    	Parul p=context.getBean(Parul.class);
//    	System.out.println(p);
    	
    	ApplicationContext  context = new ClassPathXmlApplicationContext("com/spring/Codinghub_annotations/Config.xml");
    	
    	 
    	
    }
}
