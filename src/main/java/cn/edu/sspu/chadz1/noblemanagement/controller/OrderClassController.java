package cn.edu.sspu.chadz1.noblemanagement.controller;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.OrderClassVO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.entity.OrderclassEntity;
import cn.edu.sspu.chadz1.noblemanagement.service.impl.OrderClassServiceImpl;
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
@RequestMapping(value = "/order")
@Api(tags = "预约课程相关接口", value = "预约课程相关接口")
public class OrderClassController {

    @Autowired
    private OrderClassServiceImpl orderClassService;

    @GetMapping(value = "/findAllOrders")
    @ApiOperation(value = "查询所有预约课程信息")
    public BaseResponse findAll() {
        BaseResponse all = orderClassService.findAll();
        return all;
    }

    @PostMapping(value = "/findOrder")
    @ApiOperation(value = "条件查询预约课程")
    public BaseResponse findOrder(@RequestBody OrderClassVO orderClassVO) {
        BaseResponse order = orderClassService.findOrder(orderClassVO);
        return order;
    }

    @PostMapping(value = "deleteOrder")
    @ApiOperation(value = "删除预约信息")
    public BaseResponse deleteOrder(@RequestParam Integer id) {
        BaseResponse baseResponse = orderClassService.deleteOrderClass(id);
        return baseResponse;
    }
}
