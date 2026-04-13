package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
    int soma(int a, int b) throws RemoteException;
    int subtracao(int a, int b) throws RemoteException;
    double multiplicacao(double a, double b) throws RemoteException;
}
