package cn.edu.sspu.chadz1.noblemanagement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/07
 * @Description:
 */
@Entity
@Table(name = "student", schema = "nobletest", catalog = "")
public class StudentEntity {
    private String childCode;
    private String childName;
    private String petName;
    private String sex;
    private Date bornData;
    private String stuTrain;

    @Id
    @Column(name = "childCode")
    public String getChildCode() {
        return childCode;
    }

    public void setChildCode(String childCode) {
        this.childCode = childCode;
    }

    @Basic
    @Column(name = "childName")
    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    @Basic
    @Column(name = "petName")
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "bornData")
    public Date getBornData() {
        return bornData;
    }

    public void setBornData(Date bornData) {
        this.bornData = bornData;
    }

    @Basic
    @Column(name = "stuTrain")
    public String getStuTrain() {
        return stuTrain;
    }

    public void setStuTrain(String stuTrain) {
        this.stuTrain = stuTrain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(childCode, that.childCode) &&
                Objects.equals(childName, that.childName) &&
                Objects.equals(petName, that.petName) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(bornData, that.bornData) &&
                Objects.equals(stuTrain, that.stuTrain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(childCode, childName, petName, sex, bornData, stuTrain);
    }
}
