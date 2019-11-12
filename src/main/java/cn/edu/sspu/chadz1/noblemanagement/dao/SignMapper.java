package cn.edu.sspu.chadz1.noblemanagement.dao;

import cn.edu.sspu.chadz1.noblemanagement.VO.response.SignResponseVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/12
 * @Description:
 */
@Mapper
@Component
public interface SignMapper {

    /**
     * 查询所有签到信息
     *
     * @return
     */
    @Select("SELECT signrecords.id,signrecords.signTime,signrecords.childCode,student.childName,signrecords.className FROM student INNER JOIN signrecords ON student.childCode = signrecords.childCode ORDER BY signTime DESC LIMIT #{index},#{pageSize}")
    List<SignResponseVO> findAllSign(@Param("index") Integer integer,@Param("pageSize") Integer pageSize);

    @Select("select count(*) from signrecords")
    int sumSign();
}
