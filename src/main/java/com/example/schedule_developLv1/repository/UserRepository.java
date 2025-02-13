package com.example.schedule_developLv1.repository;

import com.example.schedule_developLv1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
