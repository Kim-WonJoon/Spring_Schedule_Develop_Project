package com.example.schedule_developLv1.repository;

import com.example.schedule_developLv1.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
