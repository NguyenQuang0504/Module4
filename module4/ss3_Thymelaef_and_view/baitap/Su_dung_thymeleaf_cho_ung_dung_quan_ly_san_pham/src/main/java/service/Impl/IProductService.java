package service.Impl;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(String id);

    void save(Product product);

    void delete(String id);

    void create(Product product);

    Product findByName(String name);
}
