package com.skynetixsystems.MapStructDemo.mapper;


import com.skynetixsystems.MapStructDemo.dto.UserDTO;
import com.skynetixsystems.MapStructDemo.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}
