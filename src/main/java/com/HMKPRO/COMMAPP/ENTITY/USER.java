package com.HMKPRO.COMMAPP.ENTITY;


import com.HMKPRO.COMMAPP.ACTENTITY.ACTION;
import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userdatainfo")
public class USER<actionlist> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;

    @Column(nullable = false)
    private String name;



    @Column(name = "mobile_number",nullable = false)
    private int mobileNumber;

    @Column(name = "password",nullable = false)
    private String password;
    private String email;


       @OneToMany(mappedBy = "userlist")
//    (targetEntity = ACTION.actid)
    private List<ACTION> actionlist ;


    public int getid() {
        return userid;
    }

    public void setid(int id) {
        this.userid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



//    public List<ACTION> getActionlist() {
//        return actionlist;
//    }
//
//    public void setActionlist(List<ACTION> actionlist) {
//        this.actionlist = actionlist;
//    }
}
