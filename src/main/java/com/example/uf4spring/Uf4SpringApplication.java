package com.example.uf4spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SpringBootApplication
public class Uf4SpringApplication {

    @RequestMapping("/inicio")
    public ModelAndView hola() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("inicio.html");
        return modelAndView;
    }

    @GetMapping("/imprimirArray")
    @ResponseBody
    String[] array() {
        return new String[]{"Ani", "Sam", " Joe"};
    }
    public static void main(String[] args) {
        SpringApplication.run(Uf4SpringApplication.class, args);
    }

}
