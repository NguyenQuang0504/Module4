package demo.cart.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Product, Integer> listProduct = new HashMap<>(); // lop cart co listProduct kieu map voi key la product, khi gio hang duoc them san pham thi tang value len;

    public Cart(Map<Product, Integer> listProduct) {
        this.listProduct = listProduct;
    }

    public Cart() {
    }

    public Map<Product, Integer> getListProduct() {
        return listProduct;
    }

    public void setListProduct(Map<Product, Integer> listProduct) {
        this.listProduct = listProduct;
    }
    //Phuong thuc kiem tra xem product truyen vao co trong cart hay chua
    public boolean checkItemInCart(Product product){
        for ( Map.Entry<Product, Integer> entry : listProduct.entrySet()){
            if (entry.getKey().getId().equals(product.getId())){
                return true;
            }
        }
        return false;
    }
    // Phuong thuc  truyen vao product va lay ra thong tin key va value neu co trong list
    public Map.Entry<Product, Integer> selectItemInCart(Product product){
        for (Map.Entry<Product, Integer> entry : listProduct.entrySet()){
            if (entry.getKey().getId().equals(product.getId())){
                return entry;
            }
        }
        return null;
    }
    //Phuong thuc them moi mot item
    public void addItem(Product product){
        if(checkItemInCart(product)){
            Map.Entry<Product, Integer> newEntry = selectItemInCart(product);
            Integer countValue = newEntry.getValue()+1;
            listProduct.replace(newEntry.getKey(), countValue);
        }
        else{
            listProduct.put(product,1);
        }
    }
    //Phuong thuc tra ve so luong san pham da dat mua
    public Integer countProductInCart(){
        Integer count = 0;
        for (Map.Entry<Product, Integer> entry : listProduct.entrySet()){
            count += entry.getValue();
        }
        return count;
    }
    //Phuong thuc tra ve so luong loai san pham co trong gio hang
    public Integer countItemInCart(){
        return listProduct.size();
    }
    //Phuong thuc tinh tong tien hang da dat
    public Double totalCost(){
        Double cost=0d;
        for (Map.Entry<Product, Integer> entry : listProduct.entrySet()){
            cost += entry.getKey().getCost()*entry.getValue();
        }
        return cost;
    }
}
