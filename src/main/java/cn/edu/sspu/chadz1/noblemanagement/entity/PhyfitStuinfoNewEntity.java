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
@Table(name = "phyfit_stuinfo_new", schema = "nobletest", catalog = "")
public class PhyfitStuinfoNewEntity {
    private int id;
    private String className;
    private String childCode;
    private String student;
    private Date date;
    private String run50M;
    private String jumpRope1Min;
    private String longJump;
    private String situp;
    private String sitAndReach;

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
    @Column(name = "run50m")
    public String getRun50M() {
        return run50M;
    }

    public void setRun50M(String run50M) {
        this.run50M = run50M;
    }

    @Basic
    @Column(name = "JumpRope1min")
    public String getJumpRope1Min() {
        return jumpRope1Min;
    }

    public void setJumpRope1Min(String jumpRope1Min) {
        this.jumpRope1Min = jumpRope1Min;
    }

    @Basic
    @Column(name = "longJump")
    public String getLongJump() {
        return longJump;
    }

    public void setLongJump(String longJump) {
        this.longJump = longJump;
    }

    @Basic
    @Column(name = "situp")
    public String getSitup() {
        return situp;
    }

    public void setSitup(String situp) {
        this.situp = situp;
    }

    @Basic
    @Column(name = "sitAndReach")
    public String getSitAndReach() {
        return sitAndReach;
    }

    public void setSitAndReach(String sitAndReach) {
        this.sitAndReach = sitAndReach;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhyfitStuinfoNewEntity that = (PhyfitStuinfoNewEntity) o;
        return id == that.id &&
                Objects.equals(className, that.className) &&
                Objects.equals(childCode, that.childCode) &&
                Objects.equals(student, that.student) &&
                Objects.equals(date, that.date) &&
                Objects.equals(run50M, that.run50M) &&
                Objects.equals(jumpRope1Min, that.jumpRope1Min) &&
                Objects.equals(longJump, that.longJump) &&
                Objects.equals(situp, that.situp) &&
                Objects.equals(sitAndReach, that.sitAndReach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, className, childCode, student, date, run50M, jumpRope1Min, longJump, situp, sitAndReach);
    }
}
