package cn.zxy.agent.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Silence 000996
 * @data 17/6/30
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "hello！";
    }

    public static void main(String[] args) {
        try {
            MyRemote myRemote = new MyRemoteImpl();
            LocateRegistry.createRegistry(9999);
            Naming.rebind("rmi://127.0.0.1:9999/remoteHello",myRemote);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
