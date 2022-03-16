package demo.quan_ly_khach_hang_su_dung_restful.service.impl;

import demo.quan_ly_khach_hang_su_dung_restful.model.Customer;
import demo.quan_ly_khach_hang_su_dung_restful.repository.ICustomerRepository;
import demo.quan_ly_khach_hang_su_dung_restful.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public Customer save(Customer customer) {
        return iCustomerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return iCustomerRepository.findById(id).orElse(null);
    }


    @Override
    public void remove(Integer id) {
        iCustomerRepository.deleteById(id);
    }
}
