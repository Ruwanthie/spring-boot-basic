package com.dasuni.testapp.testapp.services;

import com.dasuni.testapp.testapp.model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<UserModel> findAllUsers();
    public String saveUser(UserModel userData);
    public String updateUser(UserModel newUserData);
    public Optional<UserModel> findById(Integer id);
}
