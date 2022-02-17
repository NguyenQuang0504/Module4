package controllers;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Impl.IUserService;
import service.UserService;
import java.util.List;

@Controller
public class LoginController {
    private IUserService iUserService = new UserService();
    @GetMapping("/login")
    public String home(){
        return "login";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
    @PostMapping("/login")
    public String login(@RequestParam String user, @RequestParam String password, ModelMap modelMap)
    {
        String mess = "";
        List<User> list = iUserService.check(user,password);
        if (list == null){
            mess = "Login Fail!!!";
            modelMap.addAttribute("mess", mess);
            return "login";
        }
        else {
            modelMap.addAttribute("username", user);
            modelMap.addAttribute("password", password);
            return "success";
        }
    }
    @PostMapping("/register")
    public String register1(@RequestParam String user, @RequestParam String password1, @RequestParam String password2, ModelMap modelMap){
        String mess = "";
        Boolean check = iUserService.checkRegister(user);
        if (password1.equals(password2) && check){
            iUserService.register(user, password1);
            mess = "Register Success!!!";
            modelMap.addAttribute("mess", mess);
            return "login";
        }
        else if (!check){
            mess = "Email already exists!!";
            modelMap.addAttribute("mess", mess);
            return "register";
        }
        else {
            mess = "Incorrect Password";
            modelMap.addAttribute("mess", mess);
            return "register";
        }
    }
}
