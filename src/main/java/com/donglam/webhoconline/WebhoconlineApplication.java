package com.donglam.webhoconline;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.donglam.webhoconline.*")
public class WebhoconlineApplication { 
	//auto config .properties
	@Bean  
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf){  
	    return hemf.getSessionFactory();  
	}  
	public static void main(String[] args) {
		SpringApplication.run(WebhoconlineApplication.class, args);
	}
}
