package com.howellxu.aopTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howellxu.aop.Act;
import com.howellxu.aop.Actor;

public class AopAnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(  
                "spring-config-aop-annotation.xml");  
		Act actor = (Act) context  
                .getBean("actor");  
		actor.perform("well done!");
	}

}
