package cn.edu.sspu.chadz1.noblemanagement.controller;

import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "教练员端相关接口", tags = "教练员端的相关接口")
@RequestMapping("/coach")
public class CoachController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "教练员登录")
    public BaseResponse login() {
        System.out.println("登录成功");
        return null;
    }
}
