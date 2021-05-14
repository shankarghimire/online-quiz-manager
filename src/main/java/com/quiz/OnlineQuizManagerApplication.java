package com.quiz;

import com.quiz.model.Role;
import com.quiz.model.User;
import com.quiz.model.UserRole;
import com.quiz.service.UserService;
import com.quiz.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class OnlineQuizManagerApplication  implements CommandLineRunner {

    @Autowired
    private UserServiceImpl userService;

    public static void main(String[] args) {
        SpringApplication.run(OnlineQuizManagerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("starting code!");
/*
        User user = new User();
        user.setFirstName("Shankar");
        user.setLastName("Ghimire");
        user.setUserName("shan");
        user.setPassword("abc");
        user.setEmail("abc@gmail.com");
        user.setProfileImage("default.png");

        Role role1 = new Role();
        role1.setRoleId(55L);
        role1.setRoleName("ADMIN");

        Set<UserRole> userRoleSet = new HashSet<>();
        UserRole userRole  = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role1);

        userRoleSet.add(userRole);

        User user1 = this.userService.createUser(user, userRoleSet);
        System.out.println(user1.getUserName());
*/
    }
}
