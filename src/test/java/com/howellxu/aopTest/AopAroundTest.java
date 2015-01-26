package com.howellxu.aopTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howellxu.aop.Actor;
import com.howellxu.aop.Thinker;
import com.howellxu.aop.Volunteer;

public class AopAroundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext(  
                "spring-config-aoparound.xml");  
		Actor actor = (Actor) context  
                .getBean("actor");  
		actor.perform("well done!");
		
		Thinker thinker = (Thinker)context.getBean("thinker");
		thinker.thinkOfSomething("want to do");
	}
}
