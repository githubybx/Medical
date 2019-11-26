package com.example.demo.UserTable;

public class User {
   String phone;
   String pass;
   int sid;

    public User() {
    }

    public User(String phone, String pass, int sid) {
        this.phone = phone;
        this.pass = pass;
        this.sid = sid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
