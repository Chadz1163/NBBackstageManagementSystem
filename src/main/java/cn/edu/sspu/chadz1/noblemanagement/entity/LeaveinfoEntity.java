package cn.edu.sspu.chadz1.noblemanagement.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/07
 * @Description:
 */
@Entity
@Table(name = "leaveinfo", schema = "nobletest", catalog = "")
public class LeaveinfoEntity {
    private int id;
    private String childName;
    private String time;
    private String reason;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeaveinfoEntity that = (LeaveinfoEntity) o;
        return id == that.id &&
                Objects.equals(childName, that.childName) &&
                Objects.equals(time, that.time) &&
                Objects.equals(reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, childName, time, reason);
    }
}
