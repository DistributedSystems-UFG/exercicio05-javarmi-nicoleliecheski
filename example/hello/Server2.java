package example.hello;

import java.rmi.Naming;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server2 {

    public Server2() {}

    public static void main(String args[]) {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Registry registry = LocateRegistry.getRegistry("localhost");

            CalculadoraImplem obj = new CalculadoraImplem(5679);

            Naming.rebind("MinhaCalculadora", obj);

            System.err.println("Server2 ready");
        } catch (Exception e) {
            System.err.println("Server2 exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
