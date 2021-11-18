package com.ethan.learn.mapstruct.entity.dto;


import java.time.LocalDateTime;

/**
 * @author ethan
 * @date 2021/10/12 2:22 下午
 */
// @Data
public class UserDto {
    private Long userId;
    private String userName;
    private String sex;
    private LocalDateTime createTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
