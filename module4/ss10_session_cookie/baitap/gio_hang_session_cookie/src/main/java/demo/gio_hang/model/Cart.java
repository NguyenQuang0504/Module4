package demo.gio_hang.model;

import java.util.HashMap;
import java.util.Map;

public class Cart  {
    private Map<Product, Integer> products = new HashMap<>();

    public Cart(Map<Product, Integer> products) {
        this.products = products;
    }

    public Cart() {
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
    // Phuong thuc giup kiem tra xem hang da co trong gio chua
    public boolean checkItemInCart(Product product){
        for (Map.Entry<Product, Integer> entry : products.entrySet()){
            if (entry.getKey().getId().equals(product.getId())){
                return true;
            }
        }
        return false;
    }
    // Phuong thuc tra ve mot product trong cart
    public Map.Entry<Product, Integer> selectItemInCart(Product product){
        for (Map.Entry<Product, Integer> entry : products.entrySet()){
            if (entry.getKey().getId().equals(product.getId())){
                return entry;
            }
        }
        return null;
    }
    // Phuong thuc add product vao trong products
    public void addItemInCart(Product product){
        Integer countItem;
        // Neu product da co trong list thi tang value len 1
        if (checkItemInCart(product)){
            Map.Entry<Product, Integer> entry = selectItemInCart(product);
            countItem = entry.getValue() +1;
            products.replace(entry.getKey(), countItem);
        }
         // Neu product chua co thi set product la 1
        else {
            products.put(product,1);
        }
    }
    // Phuong thuc tra ve so luong tat ca cac san pham trong gio hang
    public Integer countItemInCart(){
        Integer count = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()){
            count += entry.getValue();
        }
        return count;
    }
    // phuong thuc tra ve so luong mat hang trong cart
    public Integer countProductInCart(){
        return products.size();
    }
    // Phuong thuc tra ve gia tien cua gio hang
    public Double totalCost(){
        Double totalCost=0d;
        for (Map.Entry<Product, Integer> entry : products.entrySet()){
            totalCost += entry.getKey().getCost()*entry.getValue();
        }
        return totalCost;
    }
    public void downItem(Product product){
        if (checkItemInCart(product)){
            Map.Entry<Product, Integer> entry = selectItemInCart(product);
            if (entry.getValue()>1) {
                Integer count = entry.getValue() - 1;
                products.replace(entry.getKey(), count);
            }
        }
    }
    public void deleteById(Integer id){
        for (Map.Entry<Product, Integer> entry : products.entrySet()){
            if (entry.getKey().getId().equals(id)){
                products.remove(entry.getKey());
            }
        }
    }
    public void pay(){
        products.clear();
    }
}
