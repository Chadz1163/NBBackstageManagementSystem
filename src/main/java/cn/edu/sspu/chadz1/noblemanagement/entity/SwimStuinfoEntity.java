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
@Table(name = "swim_stuinfo", schema = "nobletest", catalog = "")
public class SwimStuinfoEntity {
    private int id;
    private String className;
    private String childCode;
    private String student;
    private Date date;
    private String swim25M;
    private String swim200M;
    private String splendidMoment;
    private String lineChart;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "className")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "childCode")
    public String getChildCode() {
        return childCode;
    }

    public void setChildCode(String childCode) {
        this.childCode = childCode;
    }

    @Basic
    @Column(name = "student")
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "swim25m")
    public String getSwim25M() {
        return swim25M;
    }

    public void setSwim25M(String swim25M) {
        this.swim25M = swim25M;
    }

    @Basic
    @Column(name = "swim200m")
    public String getSwim200M() {
        return swim200M;
    }

    public void setSwim200M(String swim200M) {
        this.swim200M = swim200M;
    }

    @Basic
    @Column(name = "splendidMoment")
    public String getSplendidMoment() {
        return splendidMoment;
    }

    public void setSplendidMoment(String splendidMoment) {
        this.splendidMoment = splendidMoment;
    }

    @Basic
    @Column(name = "lineChart")
    public String getLineChart() {
        return lineChart;
    }

    public void setLineChart(String lineChart) {
        this.lineChart = lineChart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SwimStuinfoEntity that = (SwimStuinfoEntity) o;
        return id == that.id &&
                Objects.equals(className, that.className) &&
                Objects.equals(childCode, that.childCode) &&
                Objects.equals(student, that.student) &&
                Objects.equals(date, that.date) &&
                Objects.equals(swim25M, that.swim25M) &&
                Objects.equals(swim200M, that.swim200M) &&
                Objects.equals(splendidMoment, that.splendidMoment) &&
                Objects.equals(lineChart, that.lineChart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, className, childCode, student, date, swim25M, swim200M, splendidMoment, lineChart);
    }
}
