package cn.edu.sspu.chadz1.noblemanagement.service;

import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/12
 * @Description:
 */
public interface SignService {

    BaseResponse findAllSign(Integer page, Integer size);

    BaseResponse updateSign(String signDate, Integer id);

    BaseResponse deleteSign(Integer id);
}
