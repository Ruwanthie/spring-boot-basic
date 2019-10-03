package com.dasuni.testapp.testapp.services.Impl;

import com.dasuni.testapp.testapp.model.UserModel;
import com.dasuni.testapp.testapp.repository.UserRepository;
import com.dasuni.testapp.testapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserModel> findAllUsers() {
        //database search
        //return all users
        List<UserModel> allUsers = userRepository.findAll() ;
        return allUsers;
    }

    @Override
    public String saveUser(UserModel userData) {
        userRepository.save(userData);
        return "Data saved";
    }

    @Override
    public String updateUser(UserModel newUserData) {
        String msg = null;
        if(newUserData.getId() != null){
            userRepository.save(newUserData);
            msg = "Data updated";
        }
        else{
            msg = "Error";
        }
        return msg;
    }

    @Override
    public Optional<UserModel> findById(Integer id) {
        return userRepository.findById(id);
    }
}
