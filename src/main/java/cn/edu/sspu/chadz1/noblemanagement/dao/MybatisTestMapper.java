package cn.edu.sspu.chadz1.noblemanagement.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MybatisTestMapper {

    void insertStudent();
}
