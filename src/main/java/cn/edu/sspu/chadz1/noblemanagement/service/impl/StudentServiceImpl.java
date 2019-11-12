package cn.edu.sspu.chadz1.noblemanagement.service.impl;

import cn.edu.sspu.chadz1.noblemanagement.PO.Student;
import cn.edu.sspu.chadz1.noblemanagement.VO.request.StudentVO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.dao.StudentMapper;
import cn.edu.sspu.chadz1.noblemanagement.enums.ResponseEnums;
import cn.edu.sspu.chadz1.noblemanagement.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public BaseResponse getStudents(int pageNum, int pageSize, int sort) {
        int studentsSum = studentMapper.getStudentsSum();
        int totalPage = (int) Math.ceil(pageSize / studentsSum);
        if (pageSize > studentsSum) {
            List<Student> students = studentMapper.getStudents(pageSize, sort, 0);
            Map data = new HashMap();
            data.put("students", students);
            data.put("totalPage", totalPage);
            BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), students);
            return baseResponse;
        } else {
            int beginIndex = (pageNum - 1) * pageSize;
            List<Student> students = studentMapper.getStudents(pageSize, sort, beginIndex);
            Map data = new HashMap();
            data.put("students", students);
            data.put("totalPage", totalPage);
            BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), students);
            return baseResponse;
        }
    }

    /**
     * 添加学员，需要给学员设置一个学号，前四位为入学年份，后七位为随机
     *
     * @param studentVO
     * @return
     */
    @Override
    public BaseResponse insertStudent(StudentVO studentVO) {
        Calendar calendar = Calendar.getInstance();
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        BaseResponse baseResponse;
        String childCode = null;
        // 确保已有学员没有这个学号
        int i = 1;
        while (i > 0) {
            int random = (int) (Math.random() * 10000000);
            String seven = String.valueOf(random);
            childCode = year + seven;
            int check = studentMapper.getChildCode(childCode);
            if (check == 0) {
                studentVO.setChildCode(childCode);
                break;
            }
        }
        studentMapper.insertStudent(studentVO);
        baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), childCode);
        return baseResponse;
    }

    @Override
    public BaseResponse editStudent(StudentVO studentVO) {
        studentMapper.editStudent(studentVO);
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), null);
        return baseResponse;
    }

    @Override
    public BaseResponse deleteStudent(String childCode) {
        studentMapper.deleteStudent(childCode);
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), null);
        return baseResponse;
    }

    @Override
    public BaseResponse findStudent(StudentVO studentVO) {
        List<Student> student = studentMapper.findStudent(studentVO);
        BaseResponse baseResponse = new BaseResponse(ResponseEnums.OK.getStatus(), ResponseEnums.OK.getMsg(), student);
        return baseResponse;
    }
}
