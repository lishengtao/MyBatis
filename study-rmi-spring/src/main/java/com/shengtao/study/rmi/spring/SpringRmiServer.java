package com.shengtao.study.rmi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRmiServer {
	public static void main(String[] args) {
		 //��ʼ������ֻ������һ��;���ж�εĻ����������������  
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-rmi-server.xml");  
        System.out.println("Spring rmi ���Գ������������");  
	}

}
