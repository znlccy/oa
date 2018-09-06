package com.youda.oa.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: Administrator
 * @Datetime: 2018/8/28-17:21
 * @Version: v1.0.0
 * @Comment: 
 */

@Table(name = "tb_user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "gender")
    private int gender;

    @Column(name = "registerTime")
    private Date registerTime;

    @Column(name = "loginTime")
    private Date loginTime;

    @Column(name = "loginIp")
    private String loingIp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoingIp() {
        return loingIp;
    }

    public void setLoingIp(String loingIp) {
        this.loingIp = loingIp;
    }
}
