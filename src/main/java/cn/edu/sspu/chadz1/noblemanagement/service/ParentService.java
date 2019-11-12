package cn.edu.sspu.chadz1.noblemanagement.service;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.ParentVO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.entity.ParentEntity;

import java.util.List;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/07
 * @Description:
 */
public interface ParentService {

    BaseResponse findAllParent(Integer page, Integer size);

    BaseResponse deleteParent(int id);

    BaseResponse findParent(ParentVO parentVO, Integer page, Integer size);
}
