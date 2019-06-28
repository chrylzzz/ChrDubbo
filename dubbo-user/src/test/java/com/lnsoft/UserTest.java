package com.lnsoft;

import com.lnsoft.model.Order;
import com.lnsoft.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created By Chr on 2019/3/9/0009.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/user-consumer.xml")
public class UserTest {

    //服务注册进来
    @Resource
    private OrderService orderService;


    @Test
    public void show(){
        List<Order> orderList = orderService.queryOrder();
        System.out.println("dubbo:     "+orderList);
    }
}
