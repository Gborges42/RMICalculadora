import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceCalculadora extends Remote {
    int adicao(int x, int y) throws RemoteException;
    int subtracao(int x, int y) throws RemoteException;
}
