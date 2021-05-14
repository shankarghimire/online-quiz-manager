package com.quiz.service;

import com.quiz.model.User;
import com.quiz.model.UserRole;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface UserService {

    //Creating User
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
}
