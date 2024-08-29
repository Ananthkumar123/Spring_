package com.codinghub.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class Configaration 
{
	
	@Bean
	public  Products products() {
		return new Products(1,"comrade");	
	}
	
}
