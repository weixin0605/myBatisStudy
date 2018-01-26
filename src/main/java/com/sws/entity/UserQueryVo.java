package com.sws.entity;

import java.util.List;

//包装对象
public class UserQueryVo {
    //包装所需要的查询条件
    //用户查询体条件
    private List<Integer> ids;
    private UserCustom userCustom;
    public UserCustom getUserCustom() {
        return userCustom;
    }
    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    //可以包装其他的查询条件，订单、商品

}
