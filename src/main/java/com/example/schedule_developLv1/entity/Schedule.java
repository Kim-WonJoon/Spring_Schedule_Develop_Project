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

public class Schedule extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String toDoTitle;
    private String toDoContent;


    public Schedule(String toDoTitle, String toDoContent) {
        this.toDoTitle = toDoTitle;
        this.toDoContent = toDoContent;

    }

    public void update(String toDoTitle, String toDoContent) {
        this.toDoTitle = toDoTitle;
        this.toDoContent = toDoContent;

    }
}
