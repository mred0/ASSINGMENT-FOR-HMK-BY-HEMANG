package com.HMKPRO.COMMAPP.ACTENTITY;

import com.HMKPRO.COMMAPP.ENTITY.USER;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "actiondatainfo")

public class ACTION<userlist> {

//@ManyToMany
// private Set<USER> users = new HashSet<USER>();
//
//    @ManyToMany(mappedBy = "users")
//    private Set<ACTION> actions = new HashSet<ACTION>();

    //    @MapsId("postid")

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actid;

    @Column(updatable = true)
    private boolean islike;


    @Column(updatable = true)
    private boolean iscomment;

    @Column(updatable = true)
    private boolean isshare;


    @ManyToOne
    private  USER userlist;

    public void setUserList(USER userlist){
        this.userlist = userlist;
    }

    public int getActid() {
        return actid;
    }

    public void setActid(int actid) {
        this.actid = actid;
    }

    public boolean isIslike() {
        return islike;
    }

    public void setIslike(boolean islike) {
        this.islike = islike;
    }

    public boolean isIscomment() {
        return iscomment;
    }

    public void setIscomment(boolean iscomment) {
        this.iscomment = iscomment;
    }

    public boolean isIsshare() {
        return isshare;
    }

    public void setIsshare(boolean isshare) {
        this.isshare = isshare;
    }


//            (targetEntity = USER.userlist)
   


//    public ACTION(boolean islike) {
//        this.islike = islike;
//    }

}
