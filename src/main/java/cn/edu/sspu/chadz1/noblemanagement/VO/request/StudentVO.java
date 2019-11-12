package cn.edu.sspu.chadz1.noblemanagement.VO.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/05
 * @Description:
 */
@Data
@EntityScan
@ApiModel
public class StudentVO {

    @ApiParam(name = "学号")
    private String childCode;
    @ApiParam(name = "学员姓名")
    private String childName;
    @ApiParam(name = "小名")
    private String petName;
    @ApiParam(name = "性别")
    private String sex;
    @ApiParam(name = "出生日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date bornData;
    @ApiParam(name = "打卡")
    private String stuTrain;
}
