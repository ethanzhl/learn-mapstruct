package com.ethan.learn.mapstruct.entity.po;


import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author ethan
 * @date 2021/10/12 2:22 下午
 */
@Data
public class UserPo {
    private Long id;
    private String name;
    private String sex;
    private LocalDateTime createTime;
}
