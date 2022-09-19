package com.example.SpringTestProject.Controller;

import com.example.SpringTestProject.Service.UserDaoService;
import com.example.SpringTestProject.dto.User.User;
import com.example.SpringTestProject.exception.UserNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/socialMedia")
public class SocialMediaController {
    @Autowired
    UserDaoService userDaoService;

    @GetMapping("/findAllUser")
    public List<User> retrive(){
        return userDaoService.findAll();
    }
    @GetMapping("/findUserById/{id}")
    public User findUserById(@PathVariable Integer id){
        User user=userDaoService.findUserWithID(id);
        if(user == null){
             throw new UserNotFound("ID: "+ id);
        }
        return user;
    }
    @PostMapping("/addUser")
    public ResponseEntity<Object> addUser(@Valid @RequestBody User user){
        userDaoService.addUser(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
