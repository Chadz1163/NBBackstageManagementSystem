package cn.edu.sspu.chadz1.noblemanagement.TestService;

import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

    @Autowired
    StudentService studentService;

    @Test
    public void getStudents() {
        BaseResponse students = studentService.getStudents(2, 10, 1);
        System.out.println(students);
    }
}
