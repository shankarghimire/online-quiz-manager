package com.quiz.controller;

import com.quiz.model.Role;
import com.quiz.model.User;
import com.quiz.model.UserRole;
import com.quiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@Controller
//@RestController
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //Creating user
    //@PostMapping("/user")
    @GetMapping("/user")
    public User createUser(@RequestBody User user) throws Exception {
        System.out.println("Testing from-createUser method of of UserController!");

        Set<UserRole> roles = new HashSet<>();
        Role role = new Role();
        role.setRoleId(45L);
        role.setRoleName("NORMAL");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);
        return  this.userService.createUser(user, roles);
    }
}
