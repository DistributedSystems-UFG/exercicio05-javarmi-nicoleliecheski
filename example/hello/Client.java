package example.hello;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private Client() {}

    public static void main(String[] args) {

        System.out.println("Initiating client");

        String host = (args.length < 1) ? null : args[0];
        try {
            // Server1
            Hello stub = (Hello) Naming.lookup("rmi://" + host + "/MyHello");
            System.out.println("Found Server1");

            String response = stub.sayHello();
            System.out.println("Response: " + response);

            int total = stub.soma(100,1000);
            System.out.println("Response from soma: " + total);

            int diferenca = stub.subtracao(500,123);
            System.out.println("Response from subtracao: " + diferenca);

            double produto = stub.multiplicacao(3.5,4.0);
            System.out.println("Response from multiplicacao: " + produto);

            // Server2
            Calculadora calc = (Calculadora) Naming.lookup("rmi://" + host + "/MinhaCalculadora");
            System.out.println("\nFound Server2");

            double quociente = calc.divisao(10.0,4.0);
            System.out.println("Response from divisao: " + quociente);

            double resultadoPot = calc.potencia(2.0,10);
            System.out.println("Response from potencia: " + resultadoPot);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
