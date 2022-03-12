package demo.cart.controller;

import demo.cart.model.Cart;
import demo.cart.model.Product;
import demo.cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class HomeController {
    @Autowired
    private IProductService iProductService;

    //Khoi tao cart
    @ModelAttribute("cart")
    public Cart setUpCart(){
        return new Cart();
    }

    @GetMapping("/home")
    public String home(ModelMap modelMap){
        List<Product> products = iProductService.findAll();
        modelMap.addAttribute("products", products);
        return "home";
    }
    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Integer id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = iProductService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show")) {
            cart.addItem(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addItem(productOptional.get());
        return "redirect:/home";
    }
}
