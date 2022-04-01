package case_study_module4.controller;

import case_study_module4.model.Customer;
import case_study_module4.model.CustomerType;
import case_study_module4.service.ICustomerService;
import case_study_module4.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;
    @GetMapping("/home")
    public String displayCustomer(@PageableDefault(size = 7)Pageable pageable, ModelMap modelMap){
       Page<Customer> listCustomer = iCustomerService.findAll(pageable);
       modelMap.addAttribute("listCustomer", listCustomer);
       return "customer/home";
    }
    @GetMapping("/create")
    public String createCustomer(ModelMap modelMap){
        List<CustomerType> customerTypes = iCustomerTypeService.findAll();
        modelMap.addAttribute("listCustomerType", customerTypes);
        modelMap.addAttribute("customer", new Customer());
        return "customer/create";
    }
    @PostMapping("/save")
    public String saveCustomer(@Valid @ModelAttribute Customer customer, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "customer/create";
        }
        iCustomerService.save(customer);
        return "redirect:/customer/home";
    }
    @GetMapping("/update/{id}")
    public String updateCustomer(@PathVariable Integer id, ModelMap modelMap){
        Customer customer = iCustomerService.findById(id);
        modelMap.addAttribute("customer", customer);
        List<CustomerType> customerTypeList = iCustomerTypeService.findAll();
        modelMap.addAttribute("listCustomerType", customerTypeList);
        return "customer/update";
    }
}
