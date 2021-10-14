package com.ethan.learn.mapstruct.entity.dto;


import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author ethan
 * @date 2021/10/12 2:22 下午
 */
@Data
public class UserDto {
    private Long userId;
    private String userName;
    private String sex;
    private LocalDateTime createTime;
}
