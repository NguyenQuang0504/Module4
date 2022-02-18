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
    public String save(@RequestParam String lettuce, @RequestParam String tomato, @RequestParam String mustard, @RequestParam String sprouts, Model model){
        model.addAttribute("lettuce", lettuce);
        model.addAttribute("tomato", tomato);
        model.addAttribute("mustard", mustard);
        model.addAttribute("sprouts", sprouts);
        return "display";
    }
}
