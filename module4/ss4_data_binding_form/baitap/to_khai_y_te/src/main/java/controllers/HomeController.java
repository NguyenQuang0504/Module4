package controllers;

import model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("person", new Person());
        return "home";
    }
}
