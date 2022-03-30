package case_study_module4.controller;

import case_study_module4.model.Customer;
import case_study_module4.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/delete")
public class CustomerControllerRest {
    @Autowired
    private ICustomerService iCustomerService;
    @DeleteMapping("/{id}")
    private ResponseEntity<Customer> deleteCustomer(@PathVariable Integer id){
        Customer customer = iCustomerService.findById(id);
        iCustomerService.remove(id);
        return new ResponseEntity<>(customer, HttpStatus.NO_CONTENT);
    }
}
