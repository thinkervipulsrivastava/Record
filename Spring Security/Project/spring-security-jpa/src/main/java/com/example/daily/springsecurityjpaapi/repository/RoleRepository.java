package com.example.daily.springsecurityjpaapi.repository;

import com.example.daily.springsecurityjpaapi.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
