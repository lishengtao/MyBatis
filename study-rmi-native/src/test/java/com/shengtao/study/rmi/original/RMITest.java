package com.shengtao.study.rmi.original;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import java.rmi.Naming;

import org.junit.Before;
import org.junit.Test;

public class RMITest {
	
	@Before
	public void setUp(){
		try {
			Hello hello = new Hello(); // ʵ����Ҫ��������
			Naming.rebind("RMI_Hello", hello); // ��RMI���� ���з���
			System.out.println("=== Hello server Ready === ");
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void test() {
		 try  
	        {  
			   //�������ص�RMI���������  rmi://127.0.0.1:1099/RMI_Hello �˿�1099��Ĭ�ϵ�RMI�˿ڣ���������� rmiregistry ��ʱ�򣨼���6�㣩û��ָ������Ķ˿ںţ�Ĭ�Ͼ���1099 
	           IHello hello = (IHello) Naming.lookup("RMI_Hello");  //ͨ��RMI���Ʋ���Զ�̶���  
	           System.out.println(hello.sayHello());  //����Զ�̶���ķ���
	           assertEquals("Hello RMI", hello.sayHello()); 
	        } catch (Exception e)  
	        {  
	          e.printStackTrace();  
	        }  
	}

}
