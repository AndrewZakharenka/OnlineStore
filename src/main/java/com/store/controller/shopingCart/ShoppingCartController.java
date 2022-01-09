package com.store.controller.shopingCart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingCartController {

    @GetMapping("/shopping-cart")
    public String index(Model model){
        return "shopping-cart";
    }
}
