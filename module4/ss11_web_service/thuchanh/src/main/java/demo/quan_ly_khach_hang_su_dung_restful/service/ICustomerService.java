package demo.quan_ly_khach_hang_su_dung_restful.service;

import demo.quan_ly_khach_hang_su_dung_restful.model.Customer;

import java.util.List;

public interface ICustomerService<T> {

    Customer save(Customer customer);

    List<Customer> findAllPage(Integer size, Integer page);

    Customer findById(Integer id);

    void remove(Integer id);

    List<Customer> findAll();

    List<Customer> search(String input, String attribute);
}
