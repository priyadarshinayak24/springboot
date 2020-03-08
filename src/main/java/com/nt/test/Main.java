package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.service.Calender1;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.service")
public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Calender1 cal1=null;
		//get ioc container
		ctx=SpringApplication.run(Main.class, args);
		//get bean
		cal1=ctx.getBean("cal",Calender1.class);
		//invoke method
		System.out.println(cal1.wishMsgenerate("mupun"));
		

	}

}
