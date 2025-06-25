package com.kipper.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kipper.first_spring_app.entity.User;
import com.kipper.first_spring_app.service.HelloWorldService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/Hello_World")
@Tag(name = "Hello World API", description = "API para demonstração do Hello World")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    @Operation(summary = "Retorna a mensagem Hello World (com nome se houver)")
    public String getHelloWorld() {
        return helloWorldService.getMessage();
    }

    @PostMapping
    @Operation(summary = "Salva o nome recebido e retorna confirmação")
    public String postHelloWorld(@RequestBody User user) {
        if (user.getName() == null || user.getName().isBlank()) {
            return "Nome não pode ser nulo ou vazio.";
        }
        helloWorldService.saveName(user.getName());
        return "Nome salvo com sucesso: " + user.getName();
    }
}
