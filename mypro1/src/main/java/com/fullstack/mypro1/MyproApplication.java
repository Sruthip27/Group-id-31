package com.fullstack.mypro1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MyproApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyproApplication.class, args);
		ClassPathXmlApplicationContext conf=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach co=conf.getBean("PCoach",Coach.class);
		System.out.println("\n\t\tHERE'S THE GUIDE TO YOUR  "+co.getName()+" TRAINING");
		System.out.println(co.getDailyWorkout());
		System.out.println(co.getDiet());

		conf.close();
	}

}







