package exam.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Ten san pham khong duoc de trong")
    private String name;
    private String date;
    @Min(value = 0, message = "Gia phai lon hon khong")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "productType_id", nullable = false)
    private ProductType productType;

    public Product() {
    }

    public Product(Integer id, @NotEmpty(message = "Ten san pham khong duoc de trong") String name, String date, @Min(value = 0, message = "Gia phai lon hon khong") Double price, ProductType productType) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
        this.productType = productType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
