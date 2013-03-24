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
			Hello hello = new Hello(); // 实例化要发布的类
			Naming.rebind("RMI_Hello", hello); // 绑定RMI名称 进行发布
			System.out.println("=== Hello server Ready === ");
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void test() {
		 try  
	        {  
			   //如果是异地的RMI调用请参照  rmi://127.0.0.1:1099/RMI_Hello 端口1099是默认的RMI端口，如果你启动 rmiregistry 的时候（见第6点）没有指定特殊的端口号，默认就是1099 
	           IHello hello = (IHello) Naming.lookup("RMI_Hello");  //通过RMI名称查找远程对象  
	           System.out.println(hello.sayHello());  //调用远程对象的方法
	           assertEquals("Hello RMI", hello.sayHello()); 
	        } catch (Exception e)  
	        {  
	          e.printStackTrace();  
	        }  
	}

}
