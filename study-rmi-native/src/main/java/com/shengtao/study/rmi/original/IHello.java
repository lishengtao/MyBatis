package com.shengtao.study.rmi.original;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * �׳�RemoteException�쳣��ԭ�� 
 * �����κ�Զ�̷�������ʵ����Ҫ�������ͼ������������������������ڵ��ù�������ʱ������ 
 * ��ˣ����е�RMI������Ӧ�ŵ�try-catch���С�
 * 
 * @author shengtaoli	
 * @date   2013-03-22
 */
public interface IHello extends Remote {
	
	public String sayHello() throws RemoteException;
	
}
