package me.mdibrahim.SpringBootCRUD.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {
    @GetMapping("/")
    public String rootMethod(){
        return "Hello Spring Boot !!";
    }
}
