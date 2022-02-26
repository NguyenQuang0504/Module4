package com.demo.ung_dung_quan_ly_khach_hang.service.impl;

import com.demo.ung_dung_quan_ly_khach_hang.model.Customer;
import com.demo.ung_dung_quan_ly_khach_hang.repository.CustomerRepository;
import com.demo.ung_dung_quan_ly_khach_hang.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }
}
