package com.doces.vini.marcy.loja.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ()
public class HelloWorld {

    @GetMapping
    public String olaMundo(){
        return "Hello Marcelly";
    }
}
