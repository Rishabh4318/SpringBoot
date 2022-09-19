package com.example.SpringTestProject.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Alien {
    private int  aid;
    private String tech;
    private String aname;
   @Autowired
   @Qualifier("laptop")
    private Machine machine;
    public void show(){
        machine.compile();
        System.out.println("Show");
    }
}

