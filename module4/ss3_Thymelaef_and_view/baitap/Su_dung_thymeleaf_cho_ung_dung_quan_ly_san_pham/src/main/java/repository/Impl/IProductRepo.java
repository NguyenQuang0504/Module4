package repository.Impl;

import model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> findAll();

    Product findById(String id);

    void save(Product product);

    void delete(String id);

    void create(Product product);

    Product findByName(String name);
}
