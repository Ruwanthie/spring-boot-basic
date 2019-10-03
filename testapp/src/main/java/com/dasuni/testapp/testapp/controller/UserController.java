package com.dasuni.testapp.testapp.controller;

import com.dasuni.testapp.testapp.model.UserModel;
import com.dasuni.testapp.testapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public List<UserModel> allUsers(){
        return userService.findAllUsers();
    }

    @PostMapping(value = "/add")
    public String addUser(@RequestBody UserModel userData){
        return userService.saveUser(userData);
    }

    @PutMapping(value = "/update")
    public String updateUser(@RequestBody UserModel newUserData){
        return userService.updateUser(newUserData);
    }

    @GetMapping(value = "/find/{id}")
    public Optional<UserModel> getUserById(@PathVariable Integer id){
        return userService.findById(id);
    }
}
