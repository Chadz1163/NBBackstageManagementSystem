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
public class ParentVO {

    @ApiModelProperty(name = "手机号码", value = "")
    private String userID;
    @ApiModelProperty(name = "学号", value = "")
    private String childCode;
    @ApiModelProperty(name = "家长姓名", value = "")
    private String parentName;
    @ApiModelProperty(name = "学员姓名", value = "")
    private String childName;
}
