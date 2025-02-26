package com.example.SpringBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBeanApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext container= SpringApplication.run(SpringBeanApplication.class, args);
//		Student st=container.getBean(Student.class);
//		System.out.println(st);
		Teacher st=container.getBean(Teacher.class);
		System.out.println(st);
	}

}
