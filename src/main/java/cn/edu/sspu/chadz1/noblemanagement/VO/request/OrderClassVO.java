package cn.edu.sspu.chadz1.noblemanagement.VO.request;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/12
 * @Description:
 */
@Data
@ApiModel
@EntityScan
public class OrderClassVO {
    @ApiModelProperty(name = "预约课程",value = "",example = "体适能")
    private String orderClass;
    @ApiModelProperty(name = "预约人姓名",value = "",example = "")
    private String orderName;
    @ApiModelProperty(name = "预约时间",value = "",example = "下周一下午 4：30~6：00")
    private String orderTime;
}
