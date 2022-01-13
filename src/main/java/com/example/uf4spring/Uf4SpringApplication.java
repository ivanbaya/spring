package com.example.uf4spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Uf4SpringApplication {

    @GetMapping("/inicio")
    @ResponseBody
    public void hola() { }

    @GetMapping("/imprimirArray")
    @ResponseBody
    String[] array() {
        return new String[]{"Ani", "Sam", " Joe"};
    }
    public static void main(String[] args) {
        SpringApplication.run(Uf4SpringApplication.class, args);
    }

}
