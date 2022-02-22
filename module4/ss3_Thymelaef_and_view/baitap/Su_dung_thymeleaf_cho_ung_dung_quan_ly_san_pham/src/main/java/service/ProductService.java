package service;

import model.Product;
import repository.Impl.IProductRepo;
import repository.ProductRepo;
import service.Impl.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepo iProductRepo = new ProductRepo();
    @Override
    public List<Product> findAll() {
        return iProductRepo.findAll();
    }

    @Override
    public Product findById(String id) {
        return iProductRepo.findById(id);
    }

    @Override
    public void save(Product product) {
        iProductRepo.save(product);
    }

    @Override
    public void delete(String id) {
        iProductRepo.delete(id);
    }

    @Override
    public void create(Product product) {
        iProductRepo.create(product);
    }

    @Override
    public Product findByName(String name) {
        return iProductRepo.findByName(name);
    }
}
