.����RMI�����6�����裺 
1������һ��Զ�̽ӿڵĽӿڣ��ýӿ��е�ÿһ����������������������һ��RemoteException�쳣�� 
2������һ��ʵ�ָýӿڵ��ࡣ 
3��ʹ��RMIC��������Զ��ʵ������Ĳи��Ϳ�ܡ� 

	cd F:\Study\MyBatis\study-rmi-native\target\classes
	rmic com.shengtao.study.rmi.original.Hello

4������һ�������������ڷ���2��д�õ��ࡣ 
5. ����һ���ͻ��������RMI���á� 
6������rmiRegistry�������Լ���Զ�̷������Ϳͻ�����

    rmiregistry
    java.exe -Djava.rmi.server.codebase=file:/E:\MIS_Interface\momo\TestEasy\classes/  RMI_Server
      
       ע�� �� Stub �ͽӿ� I_Hello �ӵ���·����
       
7. RMI�ķ�����Ҫ��Ȩ���ⲿ������ܷ��ʣ���������Ҫ�Ķ� jre�İ�ȫ�����ļ���������Ȩ��

    C:\Program Files\Java\jdk1.5.0_04\jre\lib\security\java.policy
    grant {  
           permission java.net.SocketPermission "*:1024-65535",  
                "connect,accept";  
           permission java.net.SocketPermission "*:80","connect";  
        }; 
    