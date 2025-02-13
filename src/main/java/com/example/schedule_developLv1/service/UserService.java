package com.example.schedule_developLv1.service;


import com.example.schedule_developLv1.dto.UserRequestSto;
import com.example.schedule_developLv1.dto.UserResponseDto;
import com.example.schedule_developLv1.entity.User;
import com.example.schedule_developLv1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserResponseDto createUser(UserRequestSto dto) {
        User user = new User(dto.getUserName(), dto.getEmail());
        User savedUser = userRepository.save(user);
        return new UserResponseDto(savedUser);
    }

    public List<UserResponseDto> getAllUsers() {
        List<User> users = userRepository.findAll();

        List<UserResponseDto> dtos = new ArrayList<>();
        for (User user : users) {
            dtos.add(new UserResponseDto(user));
        }
        return dtos;
    }

    public UserResponseDto getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id의 유저 없음")
        );
        return new UserResponseDto(user);
    }

    @Transactional
    public UserResponseDto updateUser(Long id, UserRequestSto dto) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id의 유저 없음")
        );
        return new UserResponseDto(user);
    }

    public void deleteUser(Long id) {
        if(!userRepository.existsById(id)) {
            throw new IllegalArgumentException("해당 id의 유저 없음");
        }
        userRepository.deleteById(id);
    }
}
