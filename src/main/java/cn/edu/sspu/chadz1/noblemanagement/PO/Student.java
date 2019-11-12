package cn.edu.sspu.chadz1.noblemanagement.PO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@EntityScan
@Data
public class Student {

    private String childCode;
    private String childName;
    private String petName;
    private String sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date bornData;
    private String stuTrain;

}
