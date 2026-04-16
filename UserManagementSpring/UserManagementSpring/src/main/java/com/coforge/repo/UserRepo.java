package com.coforge.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}