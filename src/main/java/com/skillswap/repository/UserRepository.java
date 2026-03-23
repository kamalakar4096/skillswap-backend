package com.skillswap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillswap.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}