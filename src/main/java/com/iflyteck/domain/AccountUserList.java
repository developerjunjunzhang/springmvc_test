package com.iflyteck.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class AccountUserList implements Serializable {
    private Float money;
    private String username;
    private String password;
    private List<User> users;
    private Map<String, User> userMap;

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public String toString() {
        return "AccountUserList{" +
                "money=" + money +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", users=" + users +
                ", userMap=" + userMap +
                '}';
    }
}
