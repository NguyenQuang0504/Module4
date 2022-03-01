package thuchanh.su_dung_spring_jpa_store_proceduce.service;

import thuchanh.su_dung_spring_jpa_store_proceduce.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void saveByStoreProceduce(Customer customer);

    Customer findById(Integer id);

    void save(Customer customer);

    void delete(Integer id);

    List<Customer> findName(String search);
}
