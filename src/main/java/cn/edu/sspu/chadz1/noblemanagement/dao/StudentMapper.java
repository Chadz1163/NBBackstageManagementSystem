package cn.edu.sspu.chadz1.noblemanagement.dao;

import cn.edu.sspu.chadz1.noblemanagement.PO.Student;
import cn.edu.sspu.chadz1.noblemanagement.VO.request.StudentVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StudentMapper {

    /**
     * 分页查询所有学生
     * @param limitNum 每页的数量
     * @param sort 排序，升序和降序
     * @param beginIndex 起始值，0是第一个
     * @return
     */
    List<Student> getStudents(@Param("limitNum")int limitNum, @Param("sort")int sort, @Param("beginIndex")int beginIndex);

    /**
     * 获取学员总数目
     * @return
     */
    Integer getStudentsSum();

    /**
     * 添加学员
     */
    void insertStudent(@Param("student") StudentVO studentVO);

    /**
     * 检查学号是否重复
     * @param childCode
     * @return
     */
    int getChildCode(@Param("childCode")String childCode);

    /**
     * 编辑学员信息
     * @param studentVO
     */
    int editStudent(@Param("student") StudentVO studentVO);

    /**
     * 删除学员
     * @param childCode
     */
    int deleteStudent(@Param("childCode") String childCode);

    /**
     * 条件查询学员
     * @param studentVO
     * @return
     */
    List<Student> findStudent(@Param("student") StudentVO studentVO);

}
