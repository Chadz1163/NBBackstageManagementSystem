package cn.edu.sspu.chadz1.noblemanagement.service;

import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/07
 * @Description:
 */
public interface LeaveInfoService {

    /**
     * 查询请假信息
     * @return
     */
    BaseResponse findLeaveInfo();

    /**
     * 删除请假记录
     * @param id
     * @return
     */
    BaseResponse deleteLeaveInfo(int id);
}
