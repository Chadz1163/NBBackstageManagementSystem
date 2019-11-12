package cn.edu.sspu.chadz1.noblemanagement.controller;

import cn.edu.sspu.chadz1.noblemanagement.VO.request.StudentVO;
import cn.edu.sspu.chadz1.noblemanagement.VO.response.BaseResponse;
import cn.edu.sspu.chadz1.noblemanagement.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "学员模块", tags = "学员模块的相关接口")
@RequestMapping("/student")
@Slf4j
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/getStudents", method = RequestMethod.GET)
    @ApiOperation(value = "分页获取所有学员信息")
    public BaseResponse getStudents(@RequestParam(defaultValue = "1", value = "pageNum,页码") int pageNum,
                                    @RequestParam(defaultValue = "10", value = "pageSize,页面显示条数") int pageSize,
                                    @RequestParam(defaultValue = "1", value = "sort,排序1为升序2为降序") int sort) {
        BaseResponse students = studentService.getStudents(pageNum, pageSize, sort);
        return students;
    }

    @RequestMapping(value = "/insertStudent", method = RequestMethod.POST)
    @ApiOperation(value = "添加学员")
    public BaseResponse insertStudents(@RequestBody StudentVO studentVO) {
        BaseResponse baseResponse = studentService.insertStudent(studentVO);
        return baseResponse;
    }

    @PostMapping(value = "/editStudent")
    @ApiOperation(value = "更新学员信息")
    public BaseResponse editStudent(@RequestBody StudentVO studentVO) {
        BaseResponse baseResponse = studentService.editStudent(studentVO);
        return baseResponse;
    }

    @PostMapping(value = "/deleteStudent")
    @ApiOperation(value = "删除学员")
    public BaseResponse deleteStudent(@RequestParam String childCode) {
        BaseResponse baseResponse = studentService.deleteStudent(childCode);
        return baseResponse;
    }

    @PostMapping(value = "/findSudent")
    @ApiOperation(value = "条件查询学员信息")
    public BaseResponse findStudent(@RequestBody StudentVO studentVO) {
        BaseResponse baseResponse = studentService.findStudent(studentVO);
        return baseResponse;
    }

}
