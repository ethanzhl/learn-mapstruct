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

        final UserDto userDto = UserDto.builder()
                .userId(1L)
                .userName("zhangsan")
                .sex("man")
                .createTime(LocalDateTime.now()).build();

        final UserPo to = UserConverter.INSTANCE.to(userDto);
        System.out.println(to);

        System.out.println("===========================");

        final UserPo userPo = UserPo.builder()
                .id(1L)
                .name("zhangsan")
                .sex("man")
                .createTime(LocalDateTime.now())
                .build();

        final UserDto from = UserConverter.INSTANCE.from(userPo);
        System.out.println(from);
    }

}
