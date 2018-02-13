package com.sws.mapper;

import com.sws.entity.OrderCustom;
import com.sws.entity.Orders;

import java.util.List;

public interface OrdersMapper {
    //查询订单关联查询用户信息
    public List<OrderCustom> findOrdersUser() throws Exception;

    public List<Orders> findOrdersUserResultMap()throws Exception;

    public List<Orders> findOrdersUserAndOrderDetailResultMap() throws Exception;

    public List<Orders> findOrdersUserLazyLoading() throws Exception;
 }
