package com.fullstack.mypro3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Mypro3Application {

	public static void main(String[] args) {
		SpringApplication.run(Mypro3Application.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Configfile.xml");
		//Coach co=new CketCoach();
		Coach co1=context.getBean("BCOACH",Coach.class);
		Coach co2=context.getBean("BCOACH",Coach.class);
		System.out.println("\nWORKOUT FOR "+co1.getName()+" IS "+co1.getWorkout());
		boolean st= co1==co2;
		System.out.println("\nARE BOTH BEAN SAME??? "+st);
		System.out.println("ADDRESS1: "+co1);
		System.out.println("ADDRESS2: "+co2);
		System.out.println("------------------------------------------------------");
		
		Coach cco1=context.getBean("CCOACH",Coach.class);
		Coach cco2=context.getBean("CCOACH",Coach.class);
		System.out.println("\nWORKOUT FOR "+cco1.getName()+" IS "+cco1.getWorkout());
		st= cco1==cco2;
		System.out.println("\nARE BOTH BEAN SAME??? "+st);
		System.out.println("ADDRESS1: "+cco1);
		System.out.println("ADDRESS2: "+cco2);
		System.out.println("------------------------------------------------------");

		context.close();
	}

}
