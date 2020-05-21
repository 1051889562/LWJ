package com.yicun.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Serializable;

/**
 * (UserReal)实体类
 *
 * @author makejava
 * @since 2020-02-08 20:02:12
 */
public class UserReal implements Serializable {
    private static final long serialVersionUID = 584925650968947944L;

    private Integer id;

    private String username;

    private String realName;

    private String password;

    private Integer gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    /**
     * 1:超级管理员;2:主管;3:经理
     */
    private Integer userType;

    private Integer uresult;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public String getBirthday() {
        return simpleDateFormat.format(birthday);
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUresult() {
        return uresult;
    }

    public void setUresult(Integer uresult) {
        this.uresult = uresult;
    }

}