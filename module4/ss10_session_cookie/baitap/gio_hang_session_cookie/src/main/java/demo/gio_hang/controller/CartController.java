package demo.gio_hang.controller;

import demo.gio_hang.model.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class CartController {

    @ModelAttribute("cart")
    public Cart setUpCart(){
        return new Cart();
    }
}
