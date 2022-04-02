package case_study_module4.model;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.hibernate.annotations.Parent;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;
    @NotEmpty(message = "Ten khong duoc de trong")
    private String customer_name;
    private String customer_birth;
    private Boolean customer_gender;
    @Pattern(regexp = "^[0-9]{9}|[0-9]{12}$", message = "CMND khong dung dinh dang")
    private String customer_id_card;
    private String customer_phone;
    @Pattern(regexp = "^[\\w-\\.]+@(gmail.)+[com]{3,4}$", message = "email khong dung dinh dang")
    private String customer_email;
    @NotEmpty(message = "Dia chi khong duoc de trong")
    private String customer_address;

    @ManyToOne
    @JoinColumn(name = "customer_type_id", nullable = false)
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer")
    private List<Contract> contracts;

    public Customer(Integer customer_id, String customer_name, String customer_birth, Boolean customer_gender, String customer_id_card, String customer_phone, String customer_email, String customer_address, CustomerType customerType, List<Contract> contracts) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_birth = customer_birth;
        this.customer_gender = customer_gender;
        this.customer_id_card = customer_id_card;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.customer_address = customer_address;
        this.customerType = customerType;
        this.contracts = contracts;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Customer() {
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_birth() {
        return customer_birth;
    }

    public void setCustomer_birth(String customer_birth) {
        this.customer_birth = customer_birth;
    }

    public Boolean getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(Boolean customer_gender) {
        this.customer_gender = customer_gender;
    }

    public String getCustomer_id_card() {
        return customer_id_card;
    }

    public void setCustomer_id_card(String customer_id_card) {
        this.customer_id_card = customer_id_card;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }
}
