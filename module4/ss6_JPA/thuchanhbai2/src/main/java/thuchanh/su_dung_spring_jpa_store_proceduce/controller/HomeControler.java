package thuchanh.su_dung_spring_jpa_store_proceduce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import thuchanh.su_dung_spring_jpa_store_proceduce.model.Customer;
import thuchanh.su_dung_spring_jpa_store_proceduce.service.ICustomerService;

import java.util.List;

@Controller
public class HomeControler {

    @Autowired
    private ICustomerService iCustomerService;
    @GetMapping("/home")
    public String home(ModelMap modelMap){
        List<Customer> list = iCustomerService.findAll();
        modelMap.addAttribute("customers", list);
        return "home";
    }
    @GetMapping("/create")
    public String create(ModelMap modelMap){
        modelMap.addAttribute("customer", new Customer());
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Customer customer){
        iCustomerService.saveByStoreProceduce(customer);
        return "redirect:/home";
    }
}
