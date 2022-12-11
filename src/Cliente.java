import java.rmi.Naming;
import java.rmi.RemoteException;

public class Cliente {
    public static void main(String[] args) throws Exception{
        String nomeHost = "rmi://localhost:1099/Calculadora";
        InterfaceCalculadora calculadora = (InterfaceCalculadora) Naming.lookup(nomeHost);
        System.out.println("O resultado da soma é: " + calculadora.adicao(1, 2));
    }
}
