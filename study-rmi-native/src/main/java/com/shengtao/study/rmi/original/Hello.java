package com.shengtao.study.rmi.original;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * @author shengtaoli	
 * @date   2013-03-22
 */
public class Hello extends UnicastRemoteObject //�����UnicastRemoteObject  �̳�
        implements IHello {

	public Hello() throws RemoteException {  //��Ҫһ���׳�Remote�쳣��Ĭ�ϳ�ʼ������
		
	}

	public String sayHello() throws RemoteException {
		return "Hello RMI";
	}

}
