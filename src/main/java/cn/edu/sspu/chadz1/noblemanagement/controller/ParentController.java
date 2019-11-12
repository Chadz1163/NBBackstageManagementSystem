package cn.edu.sspu.chadz1.noblemanagement.controller;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.ParentVO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.service.impl.ParentServiceImpl;
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
@RequestMapping(value = "/parent")
@Api(tags = "家长相关接口")
@RestController
public class ParentController {

    @Autowired
    private ParentServiceImpl parentService;

    @GetMapping(value = "/findAllParent")
    @ApiOperation(value = "查询所有家长信息", tags = "查询所有家长信息")
    public BaseResponse findAllParent(@RequestParam Integer page, @RequestParam Integer size) {
        BaseResponse allParent = parentService.findAllParent(page - 1, size);
        return allParent;
    }

    @ApiOperation(value = "条件查询家长信息")
    @PostMapping(value = "/findParent")
    public BaseResponse findParent(@RequestBody ParentVO parentVO, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10")Integer size) {
        BaseResponse parent = parentService.findParent(parentVO, page - 1, size);
        return parent;
    }

    @ApiOperation(value = "删除家长信息")
    @PostMapping(value = "/deleteParent")
    public BaseResponse deleteParent(Integer id) {
        BaseResponse baseResponse = parentService.deleteParent(id);
        return baseResponse;
    }
}
