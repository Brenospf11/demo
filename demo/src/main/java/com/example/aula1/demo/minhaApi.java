package com.example.aula1.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class minhaApi {
    @GetMapping("/hello-world")
    public String helloWorld() {

        return "Hello World";
    }

    @GetMapping("/soma")
    public static int teste() {
        int soma = 1 + 2;
        System.out.println(soma);
        return soma;
    }
}