package com.example.schedule_developLv1.dto;

import com.example.schedule_developLv1.entity.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserResponseDto {
    private final Long id;
    private final String userName;
    private final String email;
    private final LocalDateTime writeTime;
    private final LocalDateTime updateTime;

    public UserResponseDto(Long id, String userName, String email, LocalDateTime writeTime, LocalDateTime updateTime) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.writeTime = writeTime;
        this.updateTime = updateTime;
    }
}
