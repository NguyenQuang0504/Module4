package demo.validation_form_input.controller;

import demo.validation_form_input.model.User;
import demo.validation_form_input.service.IUserService;
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
    public String login(ModelMap modelMap){
        modelMap.addAttribute("users", new User());
        return "home";
    }

    @PostMapping("/save")
    public String save(@Validated @ModelAttribute("users") User user, BindingResult bindingResult, ModelMap modelMap){
        if (bindingResult.hasFieldErrors()){
            return "home";
        }
        else {
            iUserService.save(user);
            return "success";
        }
    }
}
