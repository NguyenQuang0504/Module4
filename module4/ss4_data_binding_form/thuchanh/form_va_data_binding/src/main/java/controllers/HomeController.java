package controllers;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("employee", new Employee());
        return "home";
    }
    @PostMapping("/addEmployee")
    public  String employee(@ModelAttribute Employee employee, ModelMap modelMap){
        modelMap.addAttribute("id", employee.getId());
        modelMap.addAttribute("name", employee.getName());
        modelMap.addAttribute("contactNum", employee.getContactNumber());
        return "result";
    }
}
