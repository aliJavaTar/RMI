package rmi;

import business.impl.ProductBusinessImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(1190);
        ProductBusinessImpl productBusiness = new ProductBusinessImpl();
        System.out.println("data base is created!!!!!!");
        registry.rebind("productService",productBusiness);
    }
}
