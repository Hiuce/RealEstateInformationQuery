package com.kgc.xka.homework.realEstateInformationQuery.pojo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Users {
    private String carid;

    private String name;

    private Integer gender;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createtime;

    private String password;

    private Integer status;

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid == null ? null : carid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}