package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @Author:SHIGS
 * @Description
 * @Date Created in 20:36 2018/5/29
 * @modified By
 */
public class UserInfo {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
