package com.ethan.learn.mapstruct.entity.po;


import java.time.LocalDateTime;

/**
 * @author ethan
 * @date 2021/10/12 2:22 下午
 */
// @Data
public class UserPo {
    private Long id;
    private String name;
    private String sex;
    private LocalDateTime createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
