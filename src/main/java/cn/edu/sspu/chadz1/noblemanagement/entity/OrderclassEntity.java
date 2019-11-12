package cn.edu.sspu.chadz1.noblemanagement.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * Create By shidao.zhang
 *
 * @Auther: shidao.zhang
 * @Date: 2019/11/08
 * @Description:
 */
@Entity
@Table(name = "orderclass", schema = "nobletest", catalog = "")
public class OrderclassEntity {
    private int id;
    private String orderName;
    private String phoneNum;
    private String childName;
    private String age;
    private String sex;
    private String orderClass;
    private String orderTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "orderName")
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Basic
    @Column(name = "phoneNum")
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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
    @Column(name = "age")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
    @Column(name = "orderClass")
    public String getOrderClass() {
        return orderClass;
    }

    public void setOrderClass(String orderClass) {
        this.orderClass = orderClass;
    }

    @Basic
    @Column(name = "orderTime")
    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderclassEntity that = (OrderclassEntity) o;
        return id == that.id &&
                Objects.equals(orderName, that.orderName) &&
                Objects.equals(phoneNum, that.phoneNum) &&
                Objects.equals(childName, that.childName) &&
                Objects.equals(age, that.age) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(orderClass, that.orderClass) &&
                Objects.equals(orderTime, that.orderTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderName, phoneNum, childName, age, sex, orderClass, orderTime);
    }
}
