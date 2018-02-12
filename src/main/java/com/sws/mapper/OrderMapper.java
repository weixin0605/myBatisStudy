package com.sws.mapper;

import com.sws.entity.Orders;

import java.util.List;

public interface OrderMapper {
    public List<Orders> findOrdersUserResultMap()throws Exception;

    public List<Orders> findOrdersUserAndOrderDetailResultMap() throws Exception;
}
