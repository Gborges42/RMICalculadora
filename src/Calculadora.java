import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements InterfaceCalculadora {
    public Calculadora() throws RemoteException{

    }

    public int adicao(int x, int y) throws RemoteException{
        return x + y;
    }

    public int subtracao(int x, int y) throws RemoteException{
        return x - y;
    }
}
