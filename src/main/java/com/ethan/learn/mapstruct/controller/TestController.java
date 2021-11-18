package com.ethan.learn.mapstruct.controller;

import com.ethan.learn.mapstruct.entity.coverter.UserConverter;
import com.ethan.learn.mapstruct.entity.dto.UserDto;
import com.ethan.learn.mapstruct.entity.po.UserPo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ethan
 * @date 2021/10/12 2:51 下午
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public void test() {
        final UserDto userDto = UserDto.builder()
                .userId(1L)
                .userName("zhangsan")
                .sex("man").build();

        final UserPo po = UserConverter.INSTANCE.to(userDto);
        System.out.println(po);
    }
}
