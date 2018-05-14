package com.example.server.controller;

import com.example.server.dao.UserRepositiry;
import com.example.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    private UserRepositiry userRepositiry;

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userRepositiry.findAll();
    }

    @GetMapping(value = "/user/{id}")
    public User getUser(@PathVariable Long id) {
        return userRepositiry.findOne(id);
    }

    @DeleteMapping(value = "/user/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        userRepositiry.delete(id);
        return true;
    }

    @PostMapping(value = "/user")
    public User createUser(@RequestBody User user) {
        return userRepositiry.save(user);
    }

    @PutMapping(value = "/user")
    public User updateUser(@RequestBody User user) {
        return userRepositiry.save(user);
    }
}
