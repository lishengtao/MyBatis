.创建RMI程序的6个步骤： 
1、定义一个远程接口的接口，该接口中的每一个方法必须声明它将产生一个RemoteException异常。 
2、定义一个实现该接口的类。 
3、使用RMIC程序生成远程实现所需的残根和框架。 

	cd F:\Study\MyBatis\study-rmi-native\target\classes
	rmic com.shengtao.study.rmi.original.Hello

4、创建一个服务器，用于发布2中写好的类。 
5. 创建一个客户程序进行RMI调用。 
6、启动rmiRegistry并运行自己的远程服务器和客户程序。

    rmiregistry
    java.exe -Djava.rmi.server.codebase=file:/E:\MIS_Interface\momo\TestEasy\classes/  RMI_Server
      
       注意 把 Stub 和接口 I_Hello 加到类路径里
       
7. RMI的服务需要授权，外部程序才能访问，所以我们要改动 jre的安全配置文件，来开放权限

    C:\Program Files\Java\jdk1.5.0_04\jre\lib\security\java.policy
    grant {  
           permission java.net.SocketPermission "*:1024-65535",  
                "connect,accept";  
           permission java.net.SocketPermission "*:80","connect";  
        }; 
    