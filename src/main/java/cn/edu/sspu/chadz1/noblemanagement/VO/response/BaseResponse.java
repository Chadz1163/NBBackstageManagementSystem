package cn.edu.sspu.chadz1.noblemanagement.VO.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseResponse {

    private Integer status;
    private String msg;
    private Object data;
}
