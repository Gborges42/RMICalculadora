import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Cliente {
    public static int[] coletaNumeros(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nDigite o primeiro número: ");
        int A = scan.nextInt();
        System.out.println("\n\nDigite o segundo número: ");
        int B = scan.nextInt();
        int[] C = {A, B};
        return C;
    }

    public static void main(String[] args) throws Exception{
        String nomeHost = "rmi://localhost:1099/Calculadora";
        InterfaceCalculadora calculadora = (InterfaceCalculadora) Naming.lookup(nomeHost);
        //System.out.println("O resultado da soma é: " + calculadora.adicao(1, 2));
        //while (true){
            int x = 1;
            switch (x){
                case 1:
                    System.out.println("Escolha os números para calcular a SOMA");
                    int[] nums = coletaNumeros();
                    System.out.println("O resultado da s1oma é: " + calculadora.adicao(nums[0], nums[1]));
                    break;
            }

        //}
    }
}
