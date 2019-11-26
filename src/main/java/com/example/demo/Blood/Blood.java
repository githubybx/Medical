package com.example.demo.Blood;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Blood {
    String phone;
    String sid;
    String blood;
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date date;

    public Blood() {
    }

    public Blood(String phone, String sid, String blood, Date date) {
        this.phone = phone;
        this.sid = sid;
        this.blood = blood;
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
