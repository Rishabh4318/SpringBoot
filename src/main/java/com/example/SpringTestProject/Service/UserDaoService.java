package com.example.SpringTestProject.Service;

import com.example.SpringTestProject.dto.User.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> userList = new ArrayList<>();
    static {
        userList.add(new User("Rishabh",LocalDate.now().minusYears(30),1));
        userList.add(new User("Sambhav",LocalDate.now().minusYears(20),2));
        userList.add(new User("Vimal",LocalDate.now().minusYears(60),3));
        userList.add(new User("Deepa",LocalDate.now().minusYears(54),4));
        userList.add(new User("Neha",LocalDate.now().minusYears(28),5));
    }
    public List<User> findAll(){
        return userList;
    }
    public User findUserWithID(Integer id){
        return userList.stream().filter(user-> user.getId().equals(id)).findFirst().orElse(null);
    }

    public void addUser(User user){
        userList.add(user);
    }
}
