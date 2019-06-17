package cn.edu.sspu.chadz1.noblemanagement.AOP.exception;


import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.enums.ResponseEnums;
import cn.edu.sspu.chadz1.noblemanagement.exception.ServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;


@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 校验请求参数（基本类型）
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public BaseResponse constraintViolationExceptionHandler(ConstraintViolationException ex) {
        return new BaseResponse(ResponseEnums.FAIL.getStatus(), ResponseEnums.FAIL.getMsg(), null);
    }
    
    /**
     * service层异常
     */
    @ExceptionHandler(ServiceException.class)
    public BaseResponse serviceExceptionHandler(ServiceException ex) {
        return new BaseResponse(ResponseEnums.FAIL.getStatus(), ex.getMessage(), null);
    }
    
}
