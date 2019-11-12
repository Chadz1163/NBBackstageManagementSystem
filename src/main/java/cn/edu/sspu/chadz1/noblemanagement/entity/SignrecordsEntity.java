package cn.edu.sspu.chadz1.noblemanagement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/07
 * @Description:
 */
@Entity
@Table(name = "signrecords", schema = "nobletest", catalog = "")
public class SignrecordsEntity {
    private int id;
    private String childCode;
    private String className;
    private Timestamp signTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "className")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "signTime")
    public Timestamp getSignTime() {
        return signTime;
    }

    public void setSignTime(Timestamp signTime) {
        this.signTime = signTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SignrecordsEntity that = (SignrecordsEntity) o;
        return id == that.id &&
                Objects.equals(childCode, that.childCode) &&
                Objects.equals(className, that.className) &&
                Objects.equals(signTime, that.signTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, childCode, className, signTime);
    }
}
