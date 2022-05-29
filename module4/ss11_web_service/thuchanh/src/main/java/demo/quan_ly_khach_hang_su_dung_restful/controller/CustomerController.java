package demo.quan_ly_khach_hang_su_dung_restful.controller;

import demo.quan_ly_khach_hang_su_dung_restful.model.Customer;
import demo.quan_ly_khach_hang_su_dung_restful.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired

    private ICustomerService iCustomerService;
    @GetMapping("/search")
    public ResponseEntity<List<Customer>> searchByName(@RequestParam("input") String input, @RequestParam("attribute") String attribute){
        List<Customer> customerList = iCustomerService.search(input, attribute);
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<List<Customer>> getAll(){
        List<Customer> list = iCustomerService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/")
    public ResponseEntity<List<Customer>> returnList(@RequestParam("size") int size, @RequestParam("page") int page){
        Integer startGet = size*page;
        List<Customer> list = iCustomerService.findAllPage(size, startGet);
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

    @PostMapping("/create")
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
