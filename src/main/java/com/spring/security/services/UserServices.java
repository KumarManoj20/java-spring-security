package com.spring.security.services;

import com.spring.security.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
    List<User> list =  new ArrayList<>();

    public UserServices (){
        list.add(new User("manoj","1234","manoj@gmail.com"));
        list.add(new User("nitya","3456","nitya@gmail.com"));
        list.add(new User("kanchan","0987","kanchan@gmail.com"));
    }

    public List<User> getAllUsers(){
        return this.list;
    }

    public User getUser(String username){
        return this.list.stream().filter(user -> user.getUsername().equalsIgnoreCase(username)).findFirst().orElse(null);
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}
