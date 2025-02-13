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

    public UserResponseDto(User user) {
        this.id = user.getId();
        this.userName = user.getUserName();
        this.email = user.getEmail();
        this.writeTime = user.getWriteTime();
        this.updateTime = user.getUpdateTime();
    }
}
