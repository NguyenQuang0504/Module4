package demo.gio_hang.controller;

import demo.gio_hang.model.Cart;
import demo.gio_hang.model.Product;
import demo.gio_hang.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    public Cart setUpCart(){
        return new Cart();
    }
    @GetMapping("/display")
    public String display(ModelMap modelMap){
        List<Product> list = iProductService.findAll();
        modelMap.addAttribute("list", list);
        return "home";
    }
    @GetMapping("/create")
    public String create( ModelMap modelMap){
        modelMap.addAttribute("product", new Product());
        return "create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Product product){
        iProductService.save(product);
        return "redirect:/display";
    }
    @GetMapping("/add/{id}")
    public String add(@PathVariable Integer id, @ModelAttribute Product product, @ModelAttribute Cart cart, @RequestParam String action){
        Optional<Product> productOptional = iProductService.findById(id);
        if (!productOptional.isPresent()) {
            return "error.404";
        }
        if (action.equals("show")) {
            cart.addItemInCart(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addItemInCart(productOptional.get());
        return "redirect:/display";
    }
    @GetMapping("/shopping-cart")
    public ModelAndView showCart(@ModelAttribute Cart cart){
        ModelAndView modelAndView = new ModelAndView("cart");
        modelAndView.addObject("cart",cart);
        return modelAndView;
    }
}
