import java.rmi.Remote;

import java.rmi.RemoteException;





public interface ClothStoreInterface extends Remote {


    public String lookUp(String x)throws RemoteException;

    public String search(int y)throws RemoteException;

    public String order(int y)throws RemoteException;
  

}