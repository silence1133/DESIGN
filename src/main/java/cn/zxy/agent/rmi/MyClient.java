package cn.zxy.agent.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author Silence 000996
 * @data 17/6/30
 */
public class MyClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        MyRemote t = (MyRemote) Naming.lookup("rmi://127.0.0.1:9999/remoteHello");
        System.out.println(t.sayHello());
    }
}
