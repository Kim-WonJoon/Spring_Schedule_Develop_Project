package com.example.schedule_developLv1.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor

public class Schedule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String toDoTitle;
    private String toDoContent;
    private LocalDateTime writeTime;
    private LocalDateTime updateTime;

    public Schedule(String toDoTitle, String toDoContent) {
        this.toDoTitle = toDoTitle;
        this.toDoContent = toDoContent;
        this.writeTime = LocalDateTime.now();
        this.updateTime = this.writeTime;
    }

    public void update(String toDoTitle, String toDoContent) {
        this.toDoTitle = toDoTitle;
        this.toDoContent = toDoContent;
        this.updateTime = LocalDateTime.now();
    }
}
