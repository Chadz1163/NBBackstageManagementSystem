package cn.edu.sspu.chadz1.noblemanagement.dao;

import cn.edu.sspu.chadz1.noblemanagement.VO.response.SignResponseVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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
public class SignMapperTest {

    @Autowired
    private SignMapper mapper;

    @Test
    public void findAllSign() {
        List<SignResponseVO> allSign = mapper.findAllSign(1,10);
        System.out.println(allSign.get(1).toString());
        System.out.println(allSign.size());
    }
}