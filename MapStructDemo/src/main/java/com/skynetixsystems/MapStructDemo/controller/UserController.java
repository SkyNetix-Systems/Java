package com.skynetixsystems.MapStructDemo.controller;


import com.skynetixsystems.MapStructDemo.dto.UserDTO;
import com.skynetixsystems.MapStructDemo.entity.User;
import com.skynetixsystems.MapStructDemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/demo")
    public UserDTO getUserDemo() {
        User user = new User();
        user.setId(1L);
        user.setName("Gen Z Dev");
        user.setEmail("genz@example.com");

        // Convert Entity to DTO
        return userMapper.toDTO(user);
    }

    @PostMapping("/demo")
    public User createUser(@RequestBody UserDTO userDTO) {
        // Convert DTO to Entity
        return userMapper.toEntity(userDTO);
    }
}

