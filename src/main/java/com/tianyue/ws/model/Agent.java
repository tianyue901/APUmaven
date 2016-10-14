package com.tianyue.ws.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by bwang7 on 10/12/16.
 */
@Entity
@PrimaryKeyJoinColumn(name="people_id")
public class Agent extends People{
    private String username;
    private String password;

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
}
