package com.lnsoft.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * Created By Chr on 2019/3/9/0009.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/order-provider.xml")
public class OrderTest {

    @Test
    public void show() throws IOException {

        System.out.println("服务启动~");

        //阻塞
        System.in.read();
    }
}
