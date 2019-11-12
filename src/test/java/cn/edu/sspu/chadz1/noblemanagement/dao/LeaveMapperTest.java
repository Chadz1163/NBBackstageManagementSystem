package cn.edu.sspu.chadz1.noblemanagement.dao;

import cn.edu.sspu.chadz1.noblemanagement.PO.LeaveInfoPO;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
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
 * @Date: 2019/11/07
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaveMapperTest {

    @Autowired
    private LeaveMapper leaveMapper;

    @Test
    public void findLeaveInfo() {
        List<LeaveInfoPO> leaveInfo = leaveMapper.findLeaveInfo();
        for (LeaveInfoPO leaveInfoPO : leaveInfo) {
            System.out.println(leaveInfoPO);
        }
        Assert.assertNotEquals(0, leaveInfo.size());
    }

    @Test
    public void deleteLeaveInfo() {
        int i = leaveMapper.deleteLeaveInfo(11);
        Assert.assertNotEquals(0, i);
    }
}