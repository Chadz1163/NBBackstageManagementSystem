package cn.edu.sspu.chadz1.noblemanagement.service.impl;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.StudentVO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/06
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentServiceImplTest {

    @Autowired
    StudentService studentService;

    @Test
    public void getStudents() {
    }

    @Test
    public void insertStudent() {
        StudentVO studentVO = new StudentVO();
        studentVO.setChildName("tester2");
        studentVO.setPetName("t2");
        studentVO.setSex("男");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2019-01-01";
        try {
            Date parse = format.parse(date);
            studentVO.setBornData(parse);
            studentService.insertStudent(studentVO);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void editStudent() {
        StudentVO studentVO = new StudentVO();
        studentVO.setChildCode("11111111");
        studentVO.setChildName("tester2");
        studentVO.setPetName("t2");
        studentVO.setSex("男");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2019-01-01";
        try {
            Date parse = format.parse(date);
            studentVO.setBornData(parse);
            studentService.editStudent(studentVO);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deleteStudent() {
        studentService.deleteStudent("11111111");
    }

    @Test
    public void findStudent() {
        StudentVO studentVO = new StudentVO();
        studentVO.setChildCode("11111111");
        studentVO.setChildName("tester2");
        studentVO.setPetName("t2");
        studentVO.setSex("男");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2019-01-01";
        try {
            Date parse = format.parse(date);
            studentVO.setBornData(parse);
            studentService.findStudent(studentVO);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}