package demo.ung_dung_quan_ly_khach_hang.service;

import demo.ung_dung_quan_ly_khach_hang.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    Page<Customer> search(String name, Pageable pageable);
}
