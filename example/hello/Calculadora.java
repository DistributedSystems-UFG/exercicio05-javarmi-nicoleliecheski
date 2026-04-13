package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    double divisao(double a, double b) throws RemoteException;
    double potencia(double base, int exponent) throws RemoteException;
}
