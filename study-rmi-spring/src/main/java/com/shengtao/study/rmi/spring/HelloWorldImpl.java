package com.shengtao.study.rmi.spring;

public class HelloWorldImpl implements HelloWorld {

	public String sayHello() {
		return "Hello World!";
	}

	public String sayHelloToSomebody(String somebody) {
		return "Hello " + somebody;
	}

}
