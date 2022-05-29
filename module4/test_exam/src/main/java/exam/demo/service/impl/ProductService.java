package exam.demo.service.impl;

import exam.demo.model.Product;
import exam.demo.repository.IProductRepository;
import exam.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public void delete(Integer id) {
        iProductRepository.deleteById(id);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Product> findByBNane(String name, Pageable pageable) {
        return iProductRepository.findByName(name, pageable);
    }

    @Override
    public void remove(Product product) {
        iProductRepository.delete(product);
    }

    @Override
    public List<Product> findByBName(String name) {
        return iProductRepository.findByName1(name);
    }
}
