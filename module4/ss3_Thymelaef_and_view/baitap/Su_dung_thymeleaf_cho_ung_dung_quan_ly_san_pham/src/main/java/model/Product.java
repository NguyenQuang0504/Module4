package model;

public class Product {
    private String id;
    private String name;
    private Double cost;
    private String producer;

    public Product(String id, String name, Double cost, String producer) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.producer = producer;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
