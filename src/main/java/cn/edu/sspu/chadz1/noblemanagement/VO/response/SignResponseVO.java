package cn.edu.sspu.chadz1.noblemanagement.VO.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/12
 * @Description:
 */
@Data
@ApiModel
public class SignResponseVO implements Serializable {

    @ApiModelProperty(name = "签到id")
    @Id
    @JsonProperty("id")
    private Integer id;
    @ApiModelProperty(name = "签到时间")
    @JsonProperty("signTime")
    private Date signTime;
    @JsonProperty("childCode")
    @ApiModelProperty(name = "学员学号")
    private String childCode;
    @JsonProperty("childName")
    @ApiModelProperty(name = "学员姓名")
    private String childName;
    @JsonProperty("className")
    @ApiModelProperty(name = "课程名称")
    private String className;

    public SignResponseVO(Date signTime, Integer id, String childCode, String childName, String className) {
        this.id = id;
        this.signTime = signTime;
        this.childCode = childCode;
        this.childName = childName;
        this.className = className;
    }

    public SignResponseVO() {

    }

}
