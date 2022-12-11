import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {

    public static void main(String[] args){
        try {
            InterfaceCalculadora calculadora = new Calculadora();
            String hostNome = "rmi://localhost/Calculadora"

            System.out.println("Registrando o objeto no RMIRegistry");
            LocateRegistry.createRegistry(1099);
            Naming.rebind(hostNome, calculadora);

            System.out.println("Aguardando Clientes!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
