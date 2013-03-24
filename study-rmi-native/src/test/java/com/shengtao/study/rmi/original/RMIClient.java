package com.shengtao.study.rmi.original;

import java.rmi.Naming;

public class RMIClient {

	public static void main(String[] args) {
		try {
			//如果是异地的RMI调用请参照  rmi://127.0.0.1:1099/RMI_Hello 端口1099是默认的RMI端口，如果你启动 rmiregistry 的时候（见第6点）没有指定特殊的端口号，默认就是1099
			IHello hello = (IHello) Naming.lookup("RMI_Hello"); // 通过RMI名称查找远程对象
			System.out.println(hello.sayHello()); // 调用远程对象的方法
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
