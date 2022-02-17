package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private static final String  REGEX = "^^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @PostMapping("/check")
    public String checkMail(@RequestParam String email, ModelMap modelMap){
        String mess = "";
        if(email.matches(REGEX)){
            mess = "Email hop le";
            modelMap.addAttribute("mess", mess);
            return "home";
        }
        else {
            mess = "Email khong hop le";
            modelMap.addAttribute("mess", mess);
            return "home";
        }
    }
}
