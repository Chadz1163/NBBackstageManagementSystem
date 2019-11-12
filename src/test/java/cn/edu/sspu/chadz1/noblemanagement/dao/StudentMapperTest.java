package cn.edu.sspu.chadz1.noblemanagement.dao;

import cn.edu.sspu.chadz1.noblemanagement.PO.Student;
import cn.edu.sspu.chadz1.noblemanagement.VO.request.StudentVO;
import javafx.scene.input.DataFormat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/06
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    StudentMapper studentMapper;

    @Test
    public void getStudents() {
        int random = (int) (Math.random() * 10000000);
        System.out.println(random);
    }

    @Test
    public void getStudentsSum() {
    }

    @Test
    public void insertStudent() {
        StudentVO studentVO = new StudentVO();
        studentVO.setChildCode("201111111");
        studentVO.setChildName("tester1");
        studentVO.setPetName("t1");
        studentVO.setSex("男");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2019-01-01";
        try {
            Date parse = format.parse(date);
            studentVO.setBornData(parse);
            studentMapper.insertStudent(studentVO);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkChildCode() {
        int childCode = studentMapper.getChildCode("1111");
        Assert.assertEquals(0, childCode);
    }

    @Test
    public void editStudent() {
        StudentVO studentVO = new StudentVO();
        studentVO.setChildCode("201111111");
        studentVO.setChildName("tester1111");
        studentVO.setPetName("t1111");
        studentVO.setSex("男");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2019-01-02";
        try {
            Date parse = format.parse(date);
            studentVO.setBornData(parse);
            int i = studentMapper.editStudent(studentVO);
            Assert.assertEquals(1, i);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deleteStudent() {
        int i = studentMapper.deleteStudent("1111");
        Assert.assertEquals(1, i);
    }

    @Test
    public void findStudent() {
        StudentVO studentVO = new StudentVO();
        studentVO.setChildCode("201111111");
        studentVO.setChildName("tester1111");
        studentVO.setPetName("t1111");
        studentVO.setSex("男");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2019-01-02";
        try {
            Date parse = format.parse(date);
            studentVO.setBornData(parse);
            List<Student> student = studentMapper.findStudent(studentVO);
            for(Student student1 : student) {
                System.out.println(student1);
            }
            Assert.assertNotEquals(0, student.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}