package demo.ung_dung_quan_ly_khach_hang.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Provinces {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProvinces;
    private String nameProvinces;

    @OneToMany(mappedBy = "provinces")
    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Provinces() {
    }

    public Integer getIdProvinces() {
        return idProvinces;
    }

    public void setIdProvinces(Integer idProvinces) {
        this.idProvinces = idProvinces;
    }

    public String getNameProvinces() {
        return nameProvinces;
    }

    public void setNameProvinces(String nameProvinces) {
        this.nameProvinces = nameProvinces;
    }
}
