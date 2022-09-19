package com.example.SpringTestProject.Controller;

import com.example.SpringTestProject.Service.Alien;
import lombok.AccessLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @Autowired
    Alien alien;

    @GetMapping("/")
    private String getBook(){
        return "Welcome";
    }
    @GetMapping(path = "/helloWorld/{name}")
    public Alien helloAlien(@PathVariable String name){
        alien.setAname("Rishabh the Technical name");
        alien.setTech("Java Spring Boot");
        alien.setAid(1);
       return alien;
    }
}
