package com.kgc.xka.homework.realEstateInformationQuery.pojo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class RealEstate {
    private Integer id;

    private String cardid;

    private String projectname;

    private String address;

    private String housetype;

    private Integer usearea;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date buildtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype == null ? null : housetype.trim();
    }

    public Integer getUsearea() {
        return usearea;
    }

    public void setUsearea(Integer usearea) {
        this.usearea = usearea;
    }

    public Date getBuildtime() {
        return buildtime;
    }

    public void setBuildtime(Date buildtime) {
        this.buildtime = buildtime;
    }
}