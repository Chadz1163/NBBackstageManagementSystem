package cn.edu.sspu.chadz1.noblemanagement.service.impl;

import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
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
 * @Date: 2019/11/12
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SignServiceImplTest {

    @Autowired
    private SignServiceImpl signService;

    @Test
    public void findAllSign() {
        BaseResponse allSign = signService.findAllSign(10, 10);
        System.out.println(allSign.getData());
    }

    @Test
    public void updateSign() {
        BaseResponse baseResponse = signService.updateSign("2019-11-01 16:48:04", 57);
        System.out.println(baseResponse.getData());
    }

    @Test
    public void deleteSign() {
    }
}