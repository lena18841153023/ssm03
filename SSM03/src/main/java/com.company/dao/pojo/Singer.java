package com.company.dao.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
public class Singer {
    private int singerid;
    private String sname;
    @DateTimeFormat
    private Date birthday;
    private String region;

    public Singer() {
    }

    public Singer(int singerid, String sname, Date birthday, String region) {
        this.singerid = singerid;
        this.sname = sname;
        this.birthday = birthday;
        this.region = region;
    }

    public Singer(String sname, Date birthdate, String region) {
        this.sname = sname;
        this.birthday = birthdate;
        this.region = region;
    }

    public int getSingerid() {
        return singerid;
    }

    public void setSingerid(int singerid) {
        this.singerid = singerid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthdate() {
        return birthday;
    }

    public void setBirthdate(Date birthdate) {
        this.birthday = birthdate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "singerid=" + singerid +
                ", sname='" + sname + '\'' +
                ", birthdate=" + birthday +
                ", region='" + region + '\'' +
                '}';
    }
}
