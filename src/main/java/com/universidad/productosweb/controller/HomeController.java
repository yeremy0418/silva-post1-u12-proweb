package com.universidad.productosweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        // Redirige automáticamente la raíz hacia la vista de productos
        return "redirect:/productos"; 
    }
}
