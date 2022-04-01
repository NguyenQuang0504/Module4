package case_study_module4.service;

import case_study_module4.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findById(Integer id);

    void remove(Integer id);

    void save(Customer customer);

    List<Customer> findByName(String search);
    List<Customer> findAll();

    Page<Customer> find(Pageable pageable);
}
