package com.ivoronline.controllerreturns_thymeleaf.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  @RequestMapping("/hello")
  public String sayHello(Model model) {
    System.out.println("Hello from sayHello()");
    model.addAttribute("message", "Message from Controller");
    return "index";
  }

}

