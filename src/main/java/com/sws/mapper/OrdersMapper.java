package com.sws.mapper;

import com.sws.entity.OrderCustom;

import java.util.List;

public interface OrdersMapper {
    //查询订单关联查询用户信息
    public List<OrderCustom> findOrdersUser() throws Exception;
 }
