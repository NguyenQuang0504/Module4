package demo.gio_hang.service;

import demo.gio_hang.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Optional<Product> findById(Integer id);
}
