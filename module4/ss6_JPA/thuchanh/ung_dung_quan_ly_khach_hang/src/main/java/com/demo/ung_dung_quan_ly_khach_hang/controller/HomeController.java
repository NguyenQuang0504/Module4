package com.demo.ung_dung_quan_ly_khach_hang.controller;

import com.demo.ung_dung_quan_ly_khach_hang.model.Customer;
import com.demo.ung_dung_quan_ly_khach_hang.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/home")
    public String home(Model model) {
        List<Customer> list = iCustomerService.findAll();
        model.addAttribute("listCustomer", list);
        return "home";
    }

    @GetMapping("/create")
    public String create(ModelMap modelMap) {
        modelMap.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Customer customer) {
        iCustomerService.save(customer);
        return "redirect:/home";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        iCustomerService.delete(id);
        return "redirect:/home";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Integer id, ModelMap modelMap) {
        Customer customer = iCustomerService.findById(id);
        modelMap.addAttribute("customer", customer);
        return "update";
    }
}
