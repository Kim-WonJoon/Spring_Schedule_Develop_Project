package com.example.schedule_developLv1.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {
    private final Long id;
    private final String toDoTitle;
    private final String toDoContent;
    private final LocalDateTime writeTime;
    private final LocalDateTime updateTime;

    public ScheduleResponseDto(Long id, String toDoTitle, String toDoContent, LocalDateTime writeTime, LocalDateTime updateTime) {
        this.id = id;
        this.toDoTitle = toDoTitle;
        this.toDoContent = toDoContent;
        this.writeTime = writeTime;
        this.updateTime = updateTime;
    }
}
