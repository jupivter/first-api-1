package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {
    private String name = "Marta";
    @GetMapping("/")
    public String getNameController(){
        return "My name is " + name;
    }
}