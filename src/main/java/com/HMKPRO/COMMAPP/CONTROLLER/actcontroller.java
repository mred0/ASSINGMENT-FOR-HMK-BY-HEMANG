package com.HMKPRO.COMMAPP.CONTROLLER;

import com.HMKPRO.COMMAPP.ACTENTITY.ACTION;

import com.HMKPRO.COMMAPP.ENTITY.USER;
import com.HMKPRO.COMMAPP.SERVICE.actservice;
import com.HMKPRO.COMMAPP.SERVICE.userservice;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class actcontroller {
    @Autowired
    private actservice actionservice;
    @Autowired
    private userservice userService;

    @PostMapping("/addAct/{userid}")
    public ACTION addAct(@RequestBody ACTION action , @PathVariable int userid) {
       USER user = userService.getuserById(userid);
       action.setUserList(user);
        return actionservice.saveact(action);}

//    private void addUserid(int userid) {
//        public USER findUserById(@PathVariable int userid);
//        actionservice.getuserById(userid);
//
//    }
//    

    @PostMapping("/addacts")
    public List<ACTION> addActs(@RequestBody List<ACTION> actions) {
        return actionservice.saveacts(actions);
    }

    @GetMapping("/acts")
    public List<ACTION> findALL() {
        return actionservice.getactions();
    }

    @GetMapping("/act/{actid}")
    public ACTION findByActionId(@PathVariable int actid) {
        return actionservice.getactionById(actid);
    }
}
