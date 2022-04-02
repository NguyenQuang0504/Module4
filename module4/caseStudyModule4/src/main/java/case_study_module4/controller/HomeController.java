package case_study_module4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/403")
    public String error(){
        return "403Page";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
