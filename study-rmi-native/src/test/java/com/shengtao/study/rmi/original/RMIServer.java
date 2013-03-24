package com.shengtao.study.rmi.original;

import java.rmi.Naming;

public class RMIServer {
	public static void main(String[] args) {
		try {
			Hello hello = new Hello(); // ʵ����Ҫ��������
			Naming.rebind("RMI_Hello", hello); // ��RMI���� ���з���
			System.out.println("=== Hello server Ready === ");
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
