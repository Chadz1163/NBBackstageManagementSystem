package cn.edu.sspu.chadz1.noblemanagement.controller;

import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.service.impl.SignServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/12
 * @Description:
 */
@RestController
@RequestMapping(value = "/sign")
@Api(tags = "签到相关接口")
public class SignController {

    @Autowired
    private SignServiceImpl signService;

    @GetMapping("/findAllSign")
    @ApiOperation(value = "分页查询所有签到信息")
    public BaseResponse findAllSign(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "15") Integer size) {
        BaseResponse allSign = signService.findAllSign(pageNum, size);
        return allSign;
    }

    @PostMapping("/updateSign")
    @ApiOperation(value = "更该签到时间")
    public BaseResponse updateSign(Integer id, @RequestParam(defaultValue = "2019-11-01 16:48:04") String signDate) {
        BaseResponse baseResponse = signService.updateSign(signDate, id);
        return baseResponse;
    }
    @PostMapping("/deleteSign")
    @ApiOperation(value = "删除签到信息")
    public BaseResponse deleteSign(Integer id) {
        BaseResponse baseResponse = signService.deleteSign(id);
        return baseResponse;
    }
}
