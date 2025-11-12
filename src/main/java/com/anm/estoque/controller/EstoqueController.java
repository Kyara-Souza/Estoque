package com.anm.estoque.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class EstoqueController {
    
    @GetMapping("/")
    public void verificarApi() {
        System.out.println("A API está funcionando!");
    }
}
