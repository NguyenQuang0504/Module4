package demo.ung_dung_quan_ly_khach_hang.service;

import demo.ung_dung_quan_ly_khach_hang.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);
}
