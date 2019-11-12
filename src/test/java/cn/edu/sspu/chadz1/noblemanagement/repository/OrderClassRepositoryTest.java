package cn.edu.sspu.chadz1.noblemanagement.repository;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.OrderClassVO;
import cn.edu.sspu.chadz1.noblemanagement.entity.OrderclassEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/08
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderClassRepositoryTest {

    @Autowired
    private OrderClassRepository repository;

    @Test
    public void findOrderclassEntitiesBy() {
        OrderClassVO orderclassEntity = new OrderClassVO();
        orderclassEntity.setOrderName("花花");
        orderclassEntity.setOrderClass("球");
        orderclassEntity.setOrderTime("");
        List<OrderclassEntity> orderclassEntities = repository.findBy(orderclassEntity);
        for (OrderclassEntity orderclassEntity1 : orderclassEntities) {
            System.out.println(orderclassEntity1.getChildName()+"1111111111111");
        }
        Assert.assertNotNull(orderclassEntities);
    }


    @Test
    public void findAll() {
        List<OrderclassEntity> all = repository.findAll();
        Assert.assertNotNull(all);
    }
}