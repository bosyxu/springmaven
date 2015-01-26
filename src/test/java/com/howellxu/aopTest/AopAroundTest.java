package com.howellxu.aopTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howellxu.aop.Actor;

public class AopAroundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext(  
                "spring-config-aoparound.xml");  
		Actor actor = (Actor) context  
                .getBean("actor");  
		actor.perform("well done!");
	}
}
