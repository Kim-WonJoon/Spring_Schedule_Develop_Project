package com.example.schedule_developLv1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;
    private LocalDateTime writeTime;
    private LocalDateTime updateTime;


    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public void update(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
}


