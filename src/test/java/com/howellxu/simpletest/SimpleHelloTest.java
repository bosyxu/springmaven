package com.howellxu.simpletest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.howellxu.simple.*;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class SimpleHelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
		SimpleHello hello = (SimpleHello)ctx.getBean("SimpleHello");
		hello.says();
	}

}
