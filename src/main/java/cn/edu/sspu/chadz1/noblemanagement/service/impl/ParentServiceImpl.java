package cn.edu.sspu.chadz1.noblemanagement.service.impl;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.ParentVO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.entity.ParentEntity;
import cn.edu.sspu.chadz1.noblemanagement.enums.ResponseEnums;
import cn.edu.sspu.chadz1.noblemanagement.repository.ParentRepository;
import cn.edu.sspu.chadz1.noblemanagement.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
public class ParentServiceImpl implements ParentService {

    @Autowired
    private ParentRepository repository;

    @Override
    public BaseResponse findAllParent(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        Page<ParentEntity> all = repository.findAll(pageable);
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), all);
        return baseResponse;
    }

    @Override
    public BaseResponse deleteParent(int id) {
        repository.deleteById(id);
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), null);
        return baseResponse;
    }

    @Override
    public BaseResponse findParent(ParentVO parentVO, Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        List<ParentEntity> by = repository.findBy(parentVO, pageable);
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), by);
        return baseResponse;
    }
}
