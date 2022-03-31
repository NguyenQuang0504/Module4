package case_study_module4.controller;

import case_study_module4.model.Customer;
import case_study_module4.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerControllerRest {
    @Autowired
    private ICustomerService iCustomerService;
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable Integer id){
        Customer customer = iCustomerService.findById(id);
        if (customer==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iCustomerService.remove(id);
        return new ResponseEntity<>(customer, HttpStatus.NO_CONTENT);
    }
    @GetMapping("/search/{search}")
    public ResponseEntity<List<Customer>> searchCustomer(@PathVariable String search) {
        List<Customer> list = iCustomerService.findByName(search);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
