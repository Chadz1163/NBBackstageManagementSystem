package cn.edu.sspu.chadz1.noblemanagement.test;

import cn.edu.sspu.chadz1.noblemanagement.dao.MybatisTestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisTest {

    @Autowired
    MybatisTestMapper mybatisTestMapper;

    @Test
    public void mybatisMapperTest() {
        mybatisTestMapper.insertStudent();
    }
}
