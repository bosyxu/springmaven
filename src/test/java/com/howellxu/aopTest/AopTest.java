package com.howellxu.aopTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howellxu.aop.Actor;
import com.howellxu.aopTest.*;

public class AopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext(  
                "spring-config-aop.xml");  
		Actor actor = (Actor) context  
                .getBean("actor");  
		actor.perform("well done!");
	}

}
