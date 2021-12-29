package dao;

import dto.Product;

import java.util.List;

public interface ProductDao {
    void create(Product product);

    void delete(int id);

    void update(Product product);

    Product findById(int id);

    List<Product> findAll();
}
