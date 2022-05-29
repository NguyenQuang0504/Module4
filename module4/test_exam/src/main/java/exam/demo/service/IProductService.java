package exam.demo.service;

import exam.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);

    void delete(Integer id);

    void save(Product product);

    Product findById(Integer id);

    Page<Product> findByBNane(String name, Pageable pageable);

    void remove(Product product);

    List<Product> findByBName(String name);
}
