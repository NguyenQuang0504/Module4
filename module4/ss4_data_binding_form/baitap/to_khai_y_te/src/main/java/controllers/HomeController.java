package controllers;

import model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import service.Impl.IPersonService;
import service.PersonService;

@Controller
public class HomeController {
    private IPersonService iPersonService = new PersonService();
    @GetMapping("/home")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("person", new Person());
        return "home";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute(name = "person") Person person){
        iPersonService.save(person);
        return "save";
    }
}
