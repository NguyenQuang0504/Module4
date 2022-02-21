package controllers;

import model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import service.Impl.IPersonService;
import service.PersonService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    private IPersonService iPersonService = new PersonService();
    @GetMapping("/home")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("person", new Person());
        return "home";
    }
//    @PostMapping("/save")
//    public String save(@ModelAttribute(name = "person") Person person){
//        iPersonService.save(person);
//        return "save";
//    }
    @PostMapping("/save")
    public ModelAndView test(@ModelAttribute Person person){
        iPersonService.save(person);
        List<Person> list = new ArrayList<>();
        list = iPersonService.display();
        ModelAndView modelAndView = new ModelAndView("test","model", list);
        return modelAndView;
    }
}
