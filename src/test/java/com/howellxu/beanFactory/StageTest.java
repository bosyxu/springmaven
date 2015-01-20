package com.howellxu.beanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howellxu.beanFactory.*;
import com.howellxu.simple.SimpleHello;
public class StageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
		Stage stage = (Stage)ctx.getBean("Stage");
		stage.says();
		stage.says();
	}

}
