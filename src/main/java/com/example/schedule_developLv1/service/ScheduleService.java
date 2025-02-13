package com.example.schedule_developLv1.service;

import com.example.schedule_developLv1.dto.ScheduleRequestDto;
import com.example.schedule_developLv1.dto.ScheduleResponseDto;
import com.example.schedule_developLv1.entity.Schedule;
import com.example.schedule_developLv1.entity.User;
import com.example.schedule_developLv1.repository.ScheduleRepository;
import com.example.schedule_developLv1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;
    private final UserRepository userRepository;

    @Transactional
    public ScheduleResponseDto save(ScheduleRequestDto dto) {
        User user = userRepository.findById(dto.getUserId()).orElseThrow(
                () -> new IllegalArgumentException("해당 id의 유저 없음")
        );
        Schedule schedule = new Schedule(dto.getToDoTitle(), dto.getToDoContent(), user);
        Schedule savedSchedule = scheduleRepository.save(schedule);
        return new ScheduleResponseDto(savedSchedule);
    }

    public List<ScheduleResponseDto> findAll() {
        List<Schedule> schedules = scheduleRepository.findAll();

        List<ScheduleResponseDto> dtos = new ArrayList<>();
        for (Schedule schedule : schedules) {
            dtos.add(new ScheduleResponseDto(schedule));
        }
        return dtos;
    }

    public ScheduleResponseDto findById(Long id) {
        Schedule schedule = scheduleRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id의 스케쥴을 찾을 수 없음")
        );
        return new ScheduleResponseDto(schedule);
    }

    @Transactional
    public ScheduleResponseDto update(Long id, ScheduleRequestDto dto) {
        Schedule schedule = scheduleRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id의 일정을 찾을 수 없음")
        );

        schedule.update(dto.getToDoTitle(), dto.getToDoContent());
        return new ScheduleResponseDto(schedule);
    }

    public void deleteById(Long id) {
        if(!scheduleRepository.existsById(id)) {
            throw new IllegalArgumentException("해당 id의 일정을 찾을 수 없음");
        }
        scheduleRepository.deleteById(id);
    }
}
