package com.shengtao.study.rmi.original;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * @author shengtaoli	
 * @date   2013-03-22
 */
public class Hello extends UnicastRemoteObject //必须从UnicastRemoteObject  继承
        implements IHello {

	public Hello() throws RemoteException {  //需要一个抛出Remote异常的默认初始化方法
		
	}

	public String sayHello() throws RemoteException {
		return "Hello RMI";
	}

}
