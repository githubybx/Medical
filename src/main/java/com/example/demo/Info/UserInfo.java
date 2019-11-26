package com.example.demo.Info;

public class UserInfo {
    String phone;
    String age;
    String sex;
    String height;
    String weight;
    String identify;
    String address;
    String troduce;
    String illness;
    int sid;

    public UserInfo() {
    }

    public UserInfo(String phone, String age, String sex, String height, String weight, String identify, String address, String troduce, String illness) {
        this.phone = phone;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.identify = identify;
        this.address = address;
        this.troduce = troduce;
        this.illness = illness;
    }

    public UserInfo(String phone, String age, String sex, String height, String weight, String identify, String address, String troduce, String illness, int sid) {
        this.phone = phone;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.identify = identify;
        this.address = address;
        this.troduce = troduce;
        this.illness = illness;
        this.sid = sid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeight() {
        return height;
    }

    public void setHight(String height) {
        this.height = height;
    }

    public String getweight() {
        return weight;
    }

    public void setweight(String weight) {
        this.weight = weight;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTroduce() {
        return troduce;
    }

    public void setTroduce(String troduce) {
        this.troduce = troduce;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}

