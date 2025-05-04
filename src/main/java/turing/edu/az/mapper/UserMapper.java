package turing.edu.az.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import turing.edu.az.domain.entity.User;
import turing.edu.az.model.dto.UserDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDto, User> {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Override
    User toEntity(UserDto userDto);

    @Override
    List<User> toEntity(List<UserDto> userDtoList);

    @Override
    UserDto toDto(User user);

    @Override
    List<UserDto> toDto(List<User> user);
}
