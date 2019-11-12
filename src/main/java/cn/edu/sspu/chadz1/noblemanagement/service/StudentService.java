package cn.edu.sspu.chadz1.noblemanagement.service;

import cn.edu.sspu.chadz1.noblemanagement.PO.Student;
import cn.edu.sspu.chadz1.noblemanagement.VO.request.StudentVO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;

public interface StudentService {

    /**
     * 分页查询所有学生
     * @param pageNum 页码
     * @param pageSize 每页显示数目
     * @param sort 排序方式
     * @return
     */
    BaseResponse getStudents(int pageNum, int pageSize, int sort);

    /**
     * 添加学员
     * @param studentVO
     * @return
     */
    BaseResponse insertStudent(StudentVO studentVO);

    /**
     * 更新学员信息
     * @param studentVO
     * @return
     */
    BaseResponse editStudent(StudentVO studentVO);

    /**
     * 删除学员信息
     * @param childCode
     * @return
     */
    BaseResponse deleteStudent(String childCode);

    /**
     * 条件查询学员
     * @param studentVO
     * @return
     */
    BaseResponse findStudent(StudentVO studentVO);
}
