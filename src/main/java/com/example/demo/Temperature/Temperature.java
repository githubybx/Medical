package com.example.demo.Temperature;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Temperature {
    int sid;
    float temperature;
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date date;
    String phone;

    public Temperature() {
    }

    public Temperature(float temperature, Date date, String phone) {
        this.temperature = temperature;
        this.date = date;
        this.phone = phone;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
