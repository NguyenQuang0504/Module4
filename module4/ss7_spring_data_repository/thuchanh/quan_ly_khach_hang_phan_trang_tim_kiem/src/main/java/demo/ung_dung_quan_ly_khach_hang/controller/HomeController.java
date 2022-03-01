package demo.ung_dung_quan_ly_khach_hang.controller;

import demo.ung_dung_quan_ly_khach_hang.model.Customer;
import demo.ung_dung_quan_ly_khach_hang.model.Provinces;
import demo.ung_dung_quan_ly_khach_hang.repository.IProvincesRepository;
import demo.ung_dung_quan_ly_khach_hang.service.ICustomerService;
import demo.ung_dung_quan_ly_khach_hang.service.IProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/customer")
@Controller
public class HomeController {
    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private IProvincesService iProvincesService;
    @GetMapping("/home")
    public String home(@PageableDefault(size = 3) Pageable pageable, ModelMap modelMap){
        Page<Customer> customerList = iCustomerService.findAll(pageable);
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
        return "redirect:/customer/home";
    }

    @GetMapping("/search")
    public String Search(@PageableDefault(size = 3) Pageable pageable, ModelMap modelMap,@RequestParam String name){
        Page<Customer> list = iCustomerService.search(name, pageable);
        modelMap.addAttribute("list", list);
        return "display";
    }
}
