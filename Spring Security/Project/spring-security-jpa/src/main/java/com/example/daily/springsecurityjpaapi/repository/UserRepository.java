package com.example.daily.springsecurityjpaapi.repository;

import com.example.daily.springsecurityjpaapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername (String username);
}
