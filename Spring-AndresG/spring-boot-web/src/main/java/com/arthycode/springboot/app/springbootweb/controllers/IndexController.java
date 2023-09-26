package com.arthycode.springboot.app.springbootweb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arthycode.springboot.app.springbootweb.models.User;

@Controller
@RequestMapping("/app")
public class IndexController {

  @GetMapping({ "/index", "/", "/home" })
  public String index(Model model) {
    // Por detras la interfaz ModelMap(Llave valor), para pasar atributos a la
    // vista(plantilla.html)
    model.addAttribute("titulo", "Hola spring framework con Model");
    return "index";
  }

  @RequestMapping("/perfil")
  public String perfil(Model model) {
    User usuario = new User("Arthy", "Code", "arthycode@mail.com");
    usuario.setEmail("arthycode@mail.com");
    model.addAttribute("usuario", usuario);
    model.addAttribute("titulo", "Perfil usuario: ".concat(usuario.getNombre()));
    return "perfil";
  }

  @RequestMapping("/listar")
  public String listar(Model model) {
    List<User> usuarios = Arrays.asList(new User("Katia", "Yeraldin", "Katimai.com"),
        new User("Arianna", "Rodríguez", "ari.ro@mail.com"),
        new User("Roe", "Anna", "roe@mail.com"));

    model.addAttribute("titulo", "Listado de usuarios");
    model.addAttribute("usuarios", usuarios);

    return "listar";
  }
}
