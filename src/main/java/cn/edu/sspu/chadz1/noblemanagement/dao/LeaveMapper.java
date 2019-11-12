package cn.edu.sspu.chadz1.noblemanagement.dao;

import cn.edu.sspu.chadz1.noblemanagement.PO.LeaveInfoPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/07
 * @Description: 请假管理dao
 */
@Component
@Mapper
public interface LeaveMapper {

    List<LeaveInfoPO> findLeaveInfo();

    int deleteLeaveInfo(@Param("id") int id);


}
