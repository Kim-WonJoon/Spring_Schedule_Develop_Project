package com.example.schedule_developLv1.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor

public class Schedule extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String toDoTitle;
    private String toDoContent;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Schedule(String toDoTitle, String toDoContent, User user) {
        this.toDoTitle = toDoTitle;
        this.toDoContent = toDoContent;
        this.user = user;

    }

    public void update(String toDoTitle, String toDoContent) {
        this.toDoTitle = toDoTitle;
        this.toDoContent = toDoContent;

    }
}
