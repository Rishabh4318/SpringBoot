package com.example.SpringTestProject.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Machine{
    @Override
    public void compile() {
        System.out.println("compile from Desktop");
    }
}
