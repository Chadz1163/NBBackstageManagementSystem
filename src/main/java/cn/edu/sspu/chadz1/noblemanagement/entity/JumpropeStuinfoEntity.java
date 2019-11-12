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
@Table(name = "jumprope_stuinfo", schema = "nobletest", catalog = "")
public class JumpropeStuinfoEntity {
    private int id;
    private String className;
    private String childCode;
    private String student;
    private Date date;
    private String single30S;
    private String double30S;
    private String rope1Min;
    private String rope3Min;
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
    @Column(name = "single30s")
    public String getSingle30S() {
        return single30S;
    }

    public void setSingle30S(String single30S) {
        this.single30S = single30S;
    }

    @Basic
    @Column(name = "double30s")
    public String getDouble30S() {
        return double30S;
    }

    public void setDouble30S(String double30S) {
        this.double30S = double30S;
    }

    @Basic
    @Column(name = "rope1min")
    public String getRope1Min() {
        return rope1Min;
    }

    public void setRope1Min(String rope1Min) {
        this.rope1Min = rope1Min;
    }

    @Basic
    @Column(name = "rope3min")
    public String getRope3Min() {
        return rope3Min;
    }

    public void setRope3Min(String rope3Min) {
        this.rope3Min = rope3Min;
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
        JumpropeStuinfoEntity that = (JumpropeStuinfoEntity) o;
        return id == that.id &&
                Objects.equals(className, that.className) &&
                Objects.equals(childCode, that.childCode) &&
                Objects.equals(student, that.student) &&
                Objects.equals(date, that.date) &&
                Objects.equals(single30S, that.single30S) &&
                Objects.equals(double30S, that.double30S) &&
                Objects.equals(rope1Min, that.rope1Min) &&
                Objects.equals(rope3Min, that.rope3Min) &&
                Objects.equals(splendidMoment, that.splendidMoment) &&
                Objects.equals(lineChart, that.lineChart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, className, childCode, student, date, single30S, double30S, rope1Min, rope3Min, splendidMoment, lineChart);
    }
}
