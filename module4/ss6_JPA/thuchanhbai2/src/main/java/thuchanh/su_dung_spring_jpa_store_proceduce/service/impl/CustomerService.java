package thuchanh.su_dung_spring_jpa_store_proceduce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thuchanh.su_dung_spring_jpa_store_proceduce.model.Customer;
import thuchanh.su_dung_spring_jpa_store_proceduce.repository.ICustomerRepository;
import thuchanh.su_dung_spring_jpa_store_proceduce.service.ICustomerService;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void saveByStoreProceduce(Customer customer) {
        String name = customer.getName();
        String cmnd = customer.getCmnd();
        String address = customer.getAddress();
        iCustomerRepository.saveByStoreProceduce(address, cmnd, name);
    }

    @Override
    public Customer findById(Integer id) {
        return iCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public void delete(Integer id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public List<Customer> findName(String search) {
        return iCustomerRepository.findName(search);
    }
}
