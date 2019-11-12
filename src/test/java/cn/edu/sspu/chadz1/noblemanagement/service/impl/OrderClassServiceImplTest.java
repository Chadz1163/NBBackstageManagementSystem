package cn.edu.sspu.chadz1.noblemanagement.service.impl;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.OrderClassVO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.entity.OrderclassEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/08
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderClassServiceImplTest {

    @Autowired
    private OrderClassServiceImpl orderClassService;

    @Test
    public void findAll() {
        BaseResponse all = orderClassService.findAll();
        System.out.println(all);
        Assert.assertNotNull(all.getData());
    }

    @Test
    public void findOrder() {
        OrderClassVO orderclassEntity = new OrderClassVO();
        orderclassEntity.setOrderName("花花");
        orderclassEntity.setOrderClass("球");
        orderclassEntity.setOrderTime("");
        BaseResponse order = orderClassService.findOrder(orderclassEntity);
        System.out.println(order.toString());
        Assert.assertNotNull(order.getData());
    }

    @Test
    public void deleteOrderClass() {
    }
}