package com.arthycode.springboot.app.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {
  
  @GetMapping({"/index", "/", "/home"})
  public String index(Model model) {
    // Por detras la interfaz ModelMap(Llave valor), para pasar atributos a la vista(plantilla.html)
    model.addAttribute("titulo", "Hola spring framework con Model");
    return "index";
  }

}
