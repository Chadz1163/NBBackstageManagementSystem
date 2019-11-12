package cn.edu.sspu.chadz1.noblemanagement.service;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.OrderClassVO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.entity.OrderclassEntity;

import java.util.List;
import java.util.prefs.BackingStoreException;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/08
 * @Description:
 */
public interface OrderClassService  {

    BaseResponse findAll();

    BaseResponse findOrder(OrderClassVO orderClassVO);

    BaseResponse deleteOrderClass(Integer id);
}
