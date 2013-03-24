package com.shengtao.study.rmi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRmiClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-rmi-client.xml");
		HelloWorld helloWorld = (HelloWorld)(context.getBean("helloWorld"));
		System.out.println(helloWorld.sayHello());
		System.out.println(helloWorld.sayHelloToSomebody("duoduo"));
	}
}
