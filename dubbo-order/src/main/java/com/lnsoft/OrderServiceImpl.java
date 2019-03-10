package com.lnsoft;

import com.lnsoft.model.Order;
import com.lnsoft.service.OrderService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Chr on 2019/3/9/0009.
 */
public class OrderServiceImpl implements OrderService {
    public List<Order> queryOrder() {
        Order order=new Order();
        order.setOrderId(1);
        order.setAddr("烟台");
        order.setPrice(100.0);

        Order order2=new Order();
        order2.setOrderId(2);
        order2.setAddr("上海");
        order2.setPrice(200.0);


        Order order3=new Order();
        order3.setOrderId(1);
        order3.setAddr("北京");
        order3.setPrice(300.0);

        List<Order> orderList=new ArrayList<Order>();
        orderList.add(order);
        orderList.add(order2);
        orderList.add(order3);

        return orderList;

    }
}
