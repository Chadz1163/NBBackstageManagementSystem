package cn.edu.sspu.chadz1.noblemanagement.service.impl;

import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.SignResponseVO;
import cn.edu.sspu.chadz1.noblemanagement.dao.SignMapper;
import cn.edu.sspu.chadz1.noblemanagement.entity.SignrecordsEntity;
import cn.edu.sspu.chadz1.noblemanagement.enums.ResponseEnums;
import cn.edu.sspu.chadz1.noblemanagement.repository.SignRepository;
import cn.edu.sspu.chadz1.noblemanagement.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;


/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/12
 * @Description:
 */
@Service
public class SignServiceImpl implements SignService {

    @Autowired
    private SignRepository repository;
    @Autowired
    private SignMapper mapper;

    @Override
    public BaseResponse findAllSign(Integer pageNum, Integer size) {
        int sumSign = mapper.sumSign();
        int totalPage = (int) Math.ceil(sumSign * 1.0 / size);
        if (totalPage < pageNum) {
            int i = (totalPage - 1) * size;
            List<SignResponseVO> allSign = mapper.findAllSign(i, size);
            BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(),ResponseEnums.OK.getMsg(),allSign);
            return baseResponse;
        } else {
            int i = (pageNum - 1) * size;
            List<SignResponseVO> allSign = mapper.findAllSign(i, size);
            BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(),ResponseEnums.OK.getMsg(),allSign);
            return baseResponse;
        }
    }

    @Override
    public BaseResponse updateSign(String signDate,Integer id) {
        Optional<SignrecordsEntity> byId = repository.findById(id);
        SignrecordsEntity signrecordsEntity = byId.get();
        Timestamp timestamp = Timestamp.valueOf(signDate);
        signrecordsEntity.setSignTime(timestamp);
        repository.save(signrecordsEntity);
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(),ResponseEnums.OK.getMsg(),null);
        return baseResponse;
    }

    @Override
    public BaseResponse deleteSign(Integer id) {
        repository.deleteById(id);
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(),ResponseEnums.OK.getMsg(),null);
        return baseResponse;
    }
}
