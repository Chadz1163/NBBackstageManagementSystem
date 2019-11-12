package cn.edu.sspu.chadz1.noblemanagement.service.impl;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.ParentVO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
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
 * @Date: 2019/11/07
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ParentServiceImplTest {

    @Autowired
    private ParentServiceImpl parentService;
    @Test
    public void findAllParent() {
        BaseResponse allParent = parentService.findAllParent(1,1);
        System.out.println(allParent);
        Assert.assertNotNull(allParent.getData());
    }

    @Test
    public void deleteParent() {
        BaseResponse baseResponse = parentService.deleteParent(57);

        Assert.assertNull(baseResponse.getData());
    }

    @Test
    public void findParent() {
        ParentVO parentVO = new ParentVO();
        parentVO.setChildName("俞栎洋");
        parentVO.setChildCode("");
        parentVO.setParentName("");
        parentVO.setUserID("");
        BaseResponse parent = parentService.findParent(parentVO, 0, 10);
        System.out.println(parent.getData());
    }
}