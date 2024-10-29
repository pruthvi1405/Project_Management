package com.pruthvi.projectmanagement.repository;

import com.pruthvi.projectmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
