package cn.edu.sspu.chadz1.noblemanagement.controller;

import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.service.impl.LeaveInfoServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/07
 * @Description:
 */
@RestController
@RequestMapping(value = "/leaveInfo")
@Api(value = "请假管理", tags = "请假管理相关接口")
public class LeaveInfoController {
    @Autowired
    private LeaveInfoServiceImpl leaveInfoService;

    @GetMapping("/findLeaveInfo")
    @ApiOperation("查询所有请假信息")
    public BaseResponse findLeaveInfo() {
        BaseResponse leaveInfo = leaveInfoService.findLeaveInfo();
        return leaveInfo;
    }

    @PostMapping("/deleteLeaveInfo")
    @ApiOperation("删除请假信息")
    public BaseResponse deleteLeaveInfo(@RequestParam("id") int id) {
        BaseResponse leaveInfo = leaveInfoService.deleteLeaveInfo(id);
        return leaveInfo;
    }
}
