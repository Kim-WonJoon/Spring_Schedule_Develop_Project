package com.example.schedule_developLv1.dto;

import com.example.schedule_developLv1.entity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {
    private final Long id;
    private final String toDoTitle;
    private final String toDoContent;
    private final LocalDateTime writeTime;
    private final LocalDateTime updateTime;

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.toDoTitle = schedule.getToDoTitle();
        this.toDoContent = schedule.getToDoContent();
        this.writeTime = schedule.getWriteTime();
        this.updateTime = schedule.getUpdateTime();
    }
}
