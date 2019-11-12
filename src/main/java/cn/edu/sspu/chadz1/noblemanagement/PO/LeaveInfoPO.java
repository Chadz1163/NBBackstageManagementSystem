package cn.edu.sspu.chadz1.noblemanagement.PO;

import lombok.Data;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/07
 * @Description:
 */
@Data
public class LeaveInfoPO {

    // 请假信息编号
    private int id;

    // 学员姓名
    private String childName;

    // 请假时间
    private String time;

    // 原因
    private String reason;
}
