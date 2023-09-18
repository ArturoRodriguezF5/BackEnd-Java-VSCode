package com.example.arthycode.springweb.webproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {
  
  @GetMapping("/hola")
  public String getHola() {
    return "hola";
  }
}
