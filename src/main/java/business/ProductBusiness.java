package business;

import dao.ProductDao;
import dto.Product;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ProductBusiness extends Remote
{
    void create(Product product) throws RemoteException;

    void delete(int id)throws RemoteException;

    void update(Product product)throws RemoteException;

    Product findById(int id)throws RemoteException;

    List<Product> findAll()throws RemoteException;

}
