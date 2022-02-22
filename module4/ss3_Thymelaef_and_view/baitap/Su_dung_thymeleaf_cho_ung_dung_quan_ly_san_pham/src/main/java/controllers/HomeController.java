package controllers;

import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.Impl.IProductService;
import service.ProductService;

import java.util.List;

@RequestMapping("/start")
@Controller
public class HomeController {
    private IProductService iProductService = new ProductService();
    @GetMapping("/home")
    public ModelAndView home(){
        List<Product> list = iProductService.findAll();
        ModelAndView modelAndView = new ModelAndView("home", "product",list);
        return modelAndView;
    }
    @GetMapping("{id}/edit")
    public String edit(@PathVariable String id, ModelMap modelMap){
        Product product = iProductService.findById(id);
        modelMap.addAttribute("product",product);
        return "edit";
    }
    @PostMapping("/update")
    public String save(@ModelAttribute Product product){
        iProductService.save(product);
        return "redirect:/start/home";
    }
    @GetMapping("{id}/delete")
    public String delete(@PathVariable String id){
        iProductService.delete(id);
        return "redirect:/start/home";
    }
    @GetMapping("/create")
    public String create(ModelMap modelMap){
        modelMap.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Product product){
        iProductService.create(product);
        return "redirect:/start/home";
    }
    @GetMapping("/find")
    public String search(Model model, @RequestParam(name = "name1") String name){
        Product product = iProductService.findByName(name);
        model.addAttribute("product", product);
        return "display";
    }
}
