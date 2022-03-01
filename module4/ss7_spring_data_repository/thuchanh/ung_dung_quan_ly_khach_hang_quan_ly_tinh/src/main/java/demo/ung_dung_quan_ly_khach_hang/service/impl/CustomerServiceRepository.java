package demo.ung_dung_quan_ly_khach_hang.service.impl;

import demo.ung_dung_quan_ly_khach_hang.model.Customer;
import demo.ung_dung_quan_ly_khach_hang.repository.ICustomerRepository;
import demo.ung_dung_quan_ly_khach_hang.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceRepository implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }
}
