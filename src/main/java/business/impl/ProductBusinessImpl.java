package business.impl;

import business.ProductBusiness;
import dao.ProductDao;
import dao.impl.ProductDaoImpl;
import dto.Product;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ProductBusinessImpl extends UnicastRemoteObject implements ProductBusiness {

  ProductDao productDao = new ProductDaoImpl();
   // private ProductDao dao;

    public ProductBusinessImpl() throws RemoteException {}

//    public ProductDao getDao(){
//        return dao;
//    }
    @Override
    public void create(Product product) {
        productDao.create(product);
    }

    @Override
    public void delete(int id) {
        productDao.delete(id);
    }

    @Override
    public void update(Product product) {
        productDao.update(product);
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }
}
