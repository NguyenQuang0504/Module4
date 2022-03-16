package demo.quan_ly_khach_hang_su_dung_restful.controller;

import demo.quan_ly_khach_hang_su_dung_restful.model.Customer;
import demo.quan_ly_khach_hang_su_dung_restful.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/")
    public ResponseEntity<List<Customer>> returnList(){
        List<Customer> list = iCustomerService.findAll();
        if (list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Customer> findById(@PathVariable Integer id){
        Customer customer = iCustomerService.findById(id);
        if (customer==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(customer, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(iCustomerService.save(customer), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
        Customer customerOptional = iCustomerService.findById(id);
        if (customerOptional == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customer.setId(customerOptional.getId());
        return new ResponseEntity<>(iCustomerService.save(customer), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable Integer id) {
        Customer customerOptional = iCustomerService.findById(id);
        if (customerOptional==null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iCustomerService.remove(id);
        return new ResponseEntity<>(customerOptional, HttpStatus.NO_CONTENT);
    }
}
