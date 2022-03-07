package demo.validate_form_dang_ky.controller;

import demo.validate_form_dang_ky.model.User;
import demo.validate_form_dang_ky.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;
    @GetMapping("/home")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("user1", new User());
        return "home";
    }

    @PostMapping("/save")
    public String save(@Validated @ModelAttribute(name = "user1") User user, BindingResult bindingResult, ModelMap modelMap){
        if (bindingResult.hasFieldErrors()){
            return "home";
        }
        else {
            iUserService.save(user);
            return "result";
        }
    }
}
