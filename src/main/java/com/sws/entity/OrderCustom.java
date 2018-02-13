package com.sws.entity;

import java.io.Serializable;

//order订单扩展类
public class OrderCustom extends Orders implements Serializable {


    //添加用户信息
    private  String username;
    private String sex;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
