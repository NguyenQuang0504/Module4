package com.demo.ung_dung_quan_ly_khach_hang.service;

import com.demo.ung_dung_quan_ly_khach_hang.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    void delete(Integer id);

    Customer findById(Integer id);
}
