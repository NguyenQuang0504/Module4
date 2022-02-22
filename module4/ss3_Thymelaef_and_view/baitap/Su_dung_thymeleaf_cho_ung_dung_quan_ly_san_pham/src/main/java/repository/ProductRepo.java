package repository;

import model.Product;
import repository.Impl.IProductRepo;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    private static List<Product> list = new ArrayList<>();
    static {
        list.add(new Product("1", "BMW",12000.0,"BMW"));
        list.add(new Product("2", "TOYOTA",10000.0,"TOYOTA"));
        list.add(new Product("3", "ROLL-ROYCE",19000.0,"ROLL-ROYCE"));
        list.add(new Product("4", "MAZDA",10000.0,"MAZDA"));
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public Product findById(String id) {
        for (int i = 0;i<list.size();i++){
            if (list.get(i).getId().equals(id)){
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        for (int i=0;i<list.size();i++){
            if (list.get(i).getId().equals(product.getId())){
                list.get(i).setName(product.getName());
                list.get(i).setCost(product.getCost());
                list.get(i).setProducer(product.getProducer());
            }
        }
    }

    @Override
    public void delete(String id) {
        for (int i=0;i<list.size();i++){
            if (list.get(i).getId().equals(id)){
                list.remove(i);
                break;
            }
        }
    }

    @Override
    public void create(Product product) {
        list.add(product);
    }

    @Override
    public Product findByName(String name) {
        for (int i =0;i<list.size();i++){
            if (list.get(i).getName().equalsIgnoreCase(name)){
                return list.get(i);
            }
        }
        return null;
    }
}
