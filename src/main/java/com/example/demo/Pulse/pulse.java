package com.example.demo.Pulse;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class pulse {
    String phone;
    String pulse;
    String sid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date date;

    public pulse() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public pulse(String phone, String pulse, String sid, Date date) {
        this.phone = phone;
        this.pulse = pulse;
        this.sid = sid;
        this.date = date;
    }
}
