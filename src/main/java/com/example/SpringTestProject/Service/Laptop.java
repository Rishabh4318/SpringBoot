package com.example.SpringTestProject.Service;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Machine{
    private int lid;
    private String brand;
    public void compile(){
        System.out.println("Compile from laptop");
    }
}
