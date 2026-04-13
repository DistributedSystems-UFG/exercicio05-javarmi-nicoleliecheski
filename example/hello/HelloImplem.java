package example.hello;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class HelloImplem extends UnicastRemoteObject implements Hello {

    public HelloImplem(int port) throws RemoteException {
        super(port);
    }

    public String sayHello() throws RemoteException {
        return "Hello, world!";
    }

    public int soma(int a, int b) throws RemoteException {
        return a + b;
    }

    public int subtracao(int a, int b) throws RemoteException {
        return a - b;
    }

    public double multiplicacao(double a, double b) throws RemoteException {
        return a * b;
    }

}
