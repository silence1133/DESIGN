package cn.zxy.agent.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Silence 000996
 * @data 17/6/30
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
