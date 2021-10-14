package com.ethan.learn.mapstruct;

import com.ethan.learn.mapstruct.entity.coverter.UserConverter;
import com.ethan.learn.mapstruct.entity.dto.UserDto;
import com.ethan.learn.mapstruct.entity.po.UserPo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class LearnMapStructApplicationTests {

    @Test
    void contextLoads() {

        final UserDto userDto = new UserDto();
        userDto.setUserId(1L);
        userDto.setUserName("zhangsan");
        userDto.setSex("man");
        userDto.setCreateTime(LocalDateTime.now());


        final UserPo to = UserConverter.INSTANCE.to(userDto);
        System.out.println(to);

        System.out.println("===========================");

        final UserPo userPo = new UserPo();
        userPo.setId(1L);
        userPo.setName("zhangsan");
        userPo.setSex("man");
        userPo.setCreateTime(LocalDateTime.now());

        final UserDto from = UserConverter.INSTANCE.from(userPo);
        System.out.println(from);
    }

}
