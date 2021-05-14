package com.quiz.service.impl;

import com.quiz.model.User;
import com.quiz.model.UserRole;
import com.quiz.repo.RoleRepository;
import com.quiz.repo.UserRepository;
import com.quiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    //Creates user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception{



        User local = this.userRepository.findByUserName(user.getUserName());
        if(local !=null){
            System.out.println("User is already there!");
            throw new Exception("User already exist!");

        }else{
            //Creates new user
            for(UserRole ur: userRoles){
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);

        }


        return null;
    }
}
