package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @GetMapping("/home")
    public String calculator(){
        return "home";
    }
    @GetMapping("/add")
    public String add(@RequestParam String num1, @RequestParam String num2, ModelMap modelMap){
        float result = Float.parseFloat(num1)+Float.parseFloat(num2);
        modelMap.addAttribute("result", result);
        return "result";
    }
    @GetMapping("/sub")
    public String sub(@RequestParam String num1, @RequestParam String num2, ModelMap modelMap){
        float result = Float.parseFloat(num1)-Float.parseFloat(num2);
        modelMap.addAttribute("result", result);
        return "result";
    }
    @GetMapping("/multi")
    public String multi(@RequestParam String num1, @RequestParam String num2, ModelMap modelMap){
        float result = Float.parseFloat(num1)*Float.parseFloat(num2);
        modelMap.addAttribute("result", result);
        return "result";
    }
    @GetMapping("/division")
    public String division(@RequestParam String num1, @RequestParam String num2, ModelMap modelMap){
        float result = Float.parseFloat(num1)/Float.parseFloat(num2);
        modelMap.addAttribute("result", result);
        return "result";
    }
}
