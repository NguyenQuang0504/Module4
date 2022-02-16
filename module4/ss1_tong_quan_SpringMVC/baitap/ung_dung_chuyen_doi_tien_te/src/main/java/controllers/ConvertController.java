package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/controller")
    public String index(){
        return "index";
    }
    @PostMapping("/controller")
    public String convert(@RequestParam String usd, @RequestParam String rate, Model model){
        float result = Float.parseFloat(usd)*Float.parseFloat(rate);
        model.addAttribute("result", result);
        return "index";
    }
}
