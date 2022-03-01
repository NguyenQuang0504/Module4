package demo.ung_dung_quan_ly_khach_hang.controller;

import demo.ung_dung_quan_ly_khach_hang.model.Customer;
import demo.ung_dung_quan_ly_khach_hang.model.Provinces;
import demo.ung_dung_quan_ly_khach_hang.repository.IProvincesRepository;
import demo.ung_dung_quan_ly_khach_hang.service.ICustomerService;
import demo.ung_dung_quan_ly_khach_hang.service.IProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private IProvincesService iProvincesService;
    @GetMapping("/home")
    public String home(ModelMap modelMap){
        List<Customer> customerList = iCustomerService.findAll();
        modelMap.addAttribute("list", customerList);
        return "home";
    }

    @GetMapping("/create")
    public String create(ModelMap modelMap){
        modelMap.addAttribute("customer", new Customer());
        List<Provinces> list = iProvincesService.findAll();
        modelMap.addAttribute("listProvinces", list);
        return "create";
    }
    @PostMapping("/create")
    public String save(@ModelAttribute Customer customer){
        iCustomerService.save(customer);
        return "redirect:/home";
    }
}
