package cn.edu.sspu.chadz1.noblemanagement.service.impl;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.OrderClassVO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.entity.OrderclassEntity;
import cn.edu.sspu.chadz1.noblemanagement.enums.ResponseEnums;
import cn.edu.sspu.chadz1.noblemanagement.repository.OrderClassRepository;
import cn.edu.sspu.chadz1.noblemanagement.service.OrderClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/08
 * @Description:
 */
@Service
public class OrderClassServiceImpl implements OrderClassService {

    @Autowired
    private OrderClassRepository repository;

    @Override
    public BaseResponse findAll() {
        List<OrderclassEntity> all = repository.findAll();
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), all);
        return baseResponse;
    }

    @Override
    public BaseResponse findOrder(OrderClassVO orderClassVO) {
        List<OrderclassEntity> orderclassEntities = repository.findBy(orderClassVO);
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), orderclassEntities);
        return baseResponse;
    }

    @Override
    public BaseResponse deleteOrderClass(Integer id) {
        repository.deleteById(id);
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), null);
        return baseResponse;
    }
}
