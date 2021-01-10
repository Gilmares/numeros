package com.gilmar.numeros.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    
  @GetMapping(value="/") 
public String getMethodName() {
    return "Hello World! Teste completo";
    
}

  
}
