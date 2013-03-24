package com.shengtao.study.rmi.original;

import java.rmi.Naming;

public class RMIClient {

	public static void main(String[] args) {
		try {
			//�������ص�RMI���������  rmi://127.0.0.1:1099/RMI_Hello �˿�1099��Ĭ�ϵ�RMI�˿ڣ���������� rmiregistry ��ʱ�򣨼���6�㣩û��ָ������Ķ˿ںţ�Ĭ�Ͼ���1099
			IHello hello = (IHello) Naming.lookup("RMI_Hello"); // ͨ��RMI���Ʋ���Զ�̶���
			System.out.println(hello.sayHello()); // ����Զ�̶���ķ���
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
