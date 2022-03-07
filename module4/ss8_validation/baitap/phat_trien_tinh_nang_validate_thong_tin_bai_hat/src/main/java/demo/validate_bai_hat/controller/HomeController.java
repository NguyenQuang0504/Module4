package demo.validate_bai_hat.controller;


import demo.validate_bai_hat.model.TheSong;
import demo.validate_bai_hat.service.ITheSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ITheSongService iTheSongService;
    @GetMapping("/home")
    public String home(Model model){
        List<TheSong> list = iTheSongService.findAll();
        model.addAttribute("listTheSong", list);
        return "home";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("theSong", new TheSong());
        return "create";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute(name = "theSong") TheSong theSong1, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            return "create";
        }
        iTheSongService.save(theSong1);
        return "redirect:/home";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable Integer id, Model model){
        TheSong theSong = iTheSongService.findById(id);
        model.addAttribute("theSong", theSong);
        return "update";
    }
}
