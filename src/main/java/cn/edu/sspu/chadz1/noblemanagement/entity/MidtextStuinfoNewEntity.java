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
@Table(name = "midtext_stuinfo_new", schema = "nobletest", catalog = "")
public class MidtextStuinfoNewEntity {
    private int id;
    private String className;
    private String childCode;
    private String student;
    private Date date;
    private String run50M;
    private String run800MOr1000M;
    private String longJump;
    private String jumpRope4Min;
    private String pullupORsitup;

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
    @Column(name = "run800mOR1000m")
    public String getRun800MOr1000M() {
        return run800MOr1000M;
    }

    public void setRun800MOr1000M(String run800MOr1000M) {
        this.run800MOr1000M = run800MOr1000M;
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
    @Column(name = "JumpRope4min")
    public String getJumpRope4Min() {
        return jumpRope4Min;
    }

    public void setJumpRope4Min(String jumpRope4Min) {
        this.jumpRope4Min = jumpRope4Min;
    }

    @Basic
    @Column(name = "pullupORsitup")
    public String getPullupORsitup() {
        return pullupORsitup;
    }

    public void setPullupORsitup(String pullupORsitup) {
        this.pullupORsitup = pullupORsitup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MidtextStuinfoNewEntity that = (MidtextStuinfoNewEntity) o;
        return id == that.id &&
                Objects.equals(className, that.className) &&
                Objects.equals(childCode, that.childCode) &&
                Objects.equals(student, that.student) &&
                Objects.equals(date, that.date) &&
                Objects.equals(run50M, that.run50M) &&
                Objects.equals(run800MOr1000M, that.run800MOr1000M) &&
                Objects.equals(longJump, that.longJump) &&
                Objects.equals(jumpRope4Min, that.jumpRope4Min) &&
                Objects.equals(pullupORsitup, that.pullupORsitup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, className, childCode, student, date, run50M, run800MOr1000M, longJump, jumpRope4Min, pullupORsitup);
    }
}
