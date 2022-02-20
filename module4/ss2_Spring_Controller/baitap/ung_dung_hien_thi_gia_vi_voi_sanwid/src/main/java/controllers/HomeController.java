package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @PostMapping("/save")
    public String save(@RequestParam String choose, Model model){
        model.addAttribute("choose", choose);
        return "home";
    }
}
