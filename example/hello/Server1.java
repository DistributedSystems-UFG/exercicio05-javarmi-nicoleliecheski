package example.hello;

import java.rmi.Naming;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server1 {

    public Server1() {}

    public static void main(String args[]) {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Registry registry = LocateRegistry.getRegistry("localhost");
            
            HelloImplem obj = new HelloImplem(5678);
            //Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 5678);

            // Bind the remote object's stub in the registry
            Naming.rebind("MyHello", obj);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
