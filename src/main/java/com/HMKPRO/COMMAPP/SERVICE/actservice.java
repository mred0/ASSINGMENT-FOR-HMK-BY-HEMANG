package com.HMKPRO.COMMAPP.SERVICE;


import com.HMKPRO.COMMAPP.ACTENTITY.ACTION;
import com.HMKPRO.COMMAPP.ENTITY.USER;
import com.HMKPRO.COMMAPP.actionrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class actservice {
    USER appuser;
    @Autowired
    private actionrepo actionrepository;

    public ACTION saveact(ACTION action) {

//        ACTION existingUSER=actionrepository.findById(appuser.getUserid()).orElse(null);
//         actionrepository.save(existingUSER);
        return  actionrepository.save(action);
    }
    public List<ACTION> saveacts(List<ACTION> acts) {
        return  actionrepository.saveAll(acts);
    }


    public List<ACTION> getactions(){
        return actionrepository.findAll();
    }

    public ACTION getactionById(int actid){
        return actionrepository.findByActid(actid);
    }

//    public void addUserid(int userid) {
//       return actionrepository.save(userid);
//    }

//
//    public void getActionByuserid(int userid) {
//
//        actionrepository.findById(userid).orElse(null);
//    }


}
