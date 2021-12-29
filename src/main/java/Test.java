import business.ProductBusiness;
import business.impl.ProductBusinessImpl;
import dto.Product;

import java.rmi.RemoteException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws RemoteException {
        Product product = new Product();
        ProductBusiness business = new ProductBusinessImpl();
       // business.create(new Product(1,"phone","good",2000));
       // List<Product> all = business.findAll();
    //   System.out.println(all);
    }
}
