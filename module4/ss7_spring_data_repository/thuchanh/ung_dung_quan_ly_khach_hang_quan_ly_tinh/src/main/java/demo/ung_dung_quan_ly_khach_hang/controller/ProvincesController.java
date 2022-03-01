package demo.ung_dung_quan_ly_khach_hang.controller;

import demo.ung_dung_quan_ly_khach_hang.model.Provinces;
import demo.ung_dung_quan_ly_khach_hang.repository.IProvincesRepository;
import demo.ung_dung_quan_ly_khach_hang.service.IProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/provinces")
@Controller
public class ProvincesController {
    @Autowired
    private IProvincesService iProvincesService;

    @GetMapping("/create")
    public String create(ModelMap modelMap){
        modelMap.addAttribute("provinces", new Provinces());
        return "create_provinces";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Provinces provinces){
        iProvincesService.save(provinces);
        return "redirect:/customer/home";
    }
}
