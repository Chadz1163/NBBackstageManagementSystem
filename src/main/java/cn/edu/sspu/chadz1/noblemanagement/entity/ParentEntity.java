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
@Table(name = "parent", schema = "nobletest", catalog = "")
public class ParentEntity {
    private int id;
    private String userId;
    private String childCode;
    private String parentName;
    private String childName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
    @Column(name = "parentName")
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Basic
    @Column(name = "childName")
    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParentEntity that = (ParentEntity) o;
        return id == that.id &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(childCode, that.childCode) &&
                Objects.equals(parentName, that.parentName) &&
                Objects.equals(childName, that.childName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, childCode, parentName, childName);
    }
}
