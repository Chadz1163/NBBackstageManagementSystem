package cn.edu.sspu.chadz1.noblemanagement.TestDao;

import cn.edu.sspu.chadz1.noblemanagement.PO.Student;
import cn.edu.sspu.chadz1.noblemanagement.dao.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NobleManagementApplicationTests {

    @Autowired
    StudentMapper studentMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void StudentMapperTest() {
        List<Student> students = studentMapper.getStudents(10, 2, 0);
        for (Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println("学员总数为：" + studentMapper.getStudentsSum());
    }

}
