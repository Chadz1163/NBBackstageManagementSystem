package cn.edu.sspu.chadz1.noblemanagement.service.impl;

import cn.edu.sspu.chadz1.noblemanagement.PO.LeaveInfoPO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.dao.LeaveMapper;
import cn.edu.sspu.chadz1.noblemanagement.enums.ResponseEnums;
import cn.edu.sspu.chadz1.noblemanagement.service.LeaveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/07
 * @Description:
 */
@Service
public class LeaveInfoServiceImpl implements LeaveInfoService {

    @Autowired
    private LeaveMapper leaveMapper;

    @Override
    public BaseResponse findLeaveInfo() {
        List<LeaveInfoPO> leaveInfo = leaveMapper.findLeaveInfo();
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), leaveInfo);
        return baseResponse;
    }

    @Override
    public BaseResponse deleteLeaveInfo(int id) {
        leaveMapper.deleteLeaveInfo(id);
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), null);
        return baseResponse;
    }
}
