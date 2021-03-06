package cn.itcast.domain;

import org.apache.ibatis.annotations.Insert;

import java.io.Serializable;
import java.util.List;

public class Account implements Serializable {
    private Integer id;
    private Integer uid;
    private Double money;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
