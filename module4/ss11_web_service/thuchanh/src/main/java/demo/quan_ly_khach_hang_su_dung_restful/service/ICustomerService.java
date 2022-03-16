package demo.quan_ly_khach_hang_su_dung_restful.service;

import demo.quan_ly_khach_hang_su_dung_restful.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICustomerService<T> {

    Customer save(Customer customer);

    List<Customer> findAll();

    Customer findById(Integer id);

    void remove(Integer id);
}
