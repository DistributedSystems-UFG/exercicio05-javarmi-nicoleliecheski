package example.hello;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculadoraImplem extends UnicastRemoteObject implements Calculadora {

    public CalculadoraImplem(int port) throws RemoteException {
        super(port);
    }

    public double divisao(double a, double b) throws RemoteException {
        if (b == 0) throw new RemoteException("Divisao por zero");
        return a / b;
    }

    public double potencia(double base, int exponent) throws RemoteException {
        return Math.pow(base, exponent);
    }
}
