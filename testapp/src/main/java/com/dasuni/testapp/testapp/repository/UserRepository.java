package com.dasuni.testapp.testapp.repository;

import com.dasuni.testapp.testapp.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
    //getAllUsers
    //findById
    //delete
    //update
    //custom query
}
