package com.example.daily.springsecurityjpaapi.controller;

import com.example.daily.springsecurityjpaapi.model.User;
import com.example.daily.springsecurityjpaapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure/rest")
public class AdminController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

   // @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping ("/admin/add")
    public String addUserByAdmin (@RequestBody User user) {
        String pwd = user.getPassword();
        String encryptPassword = passwordEncoder.encode(pwd);
        user.setPassword(encryptPassword);
        userRepository.save(user);
        return "user added successfully";
    }

}
