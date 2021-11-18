package com.ethan.learn.mapstruct.entity.coverter;

import com.ethan.learn.mapstruct.entity.dto.UserDto;
import com.ethan.learn.mapstruct.entity.po.UserPo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author ethan
 * @date 2021/10/13 11:50 上午
 */
@Mapper
public interface UserConverter extends BasicConverter<UserDto, UserPo> {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    @Mapping(source = "userId", target = "id")
    @Mapping(source = "userName", target = "name")
    @Mapping(source = "sex", target = "sex", ignore = true)
    @Mapping(source = "createTime", target = "" )
    @Override
    UserPo to(UserDto dto);
}
