package com.shengtao.study.rmi.original;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 抛出RemoteException异常的原因 
 * 由于任何远程方法调用实际上要进行许多低级网络操作，因此网络错误可能在调用过程中随时发生。 
 * 因此，所有的RMI操作都应放到try-catch块中。
 * 
 * @author shengtaoli	
 * @date   2013-03-22
 */
public interface IHello extends Remote {
	
	public String sayHello() throws RemoteException;
	
}
