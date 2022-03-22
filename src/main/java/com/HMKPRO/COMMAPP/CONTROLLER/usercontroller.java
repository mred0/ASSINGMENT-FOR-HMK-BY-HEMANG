package com.HMKPRO.COMMAPP.CONTROLLER;

import com.HMKPRO.COMMAPP.ENTITY.USER;
import com.HMKPRO.COMMAPP.SERVICE.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class usercontroller {
static Boolean isLogin = false;

    @Autowired
    private userservice service;

    @PostMapping("/addUser")
    public USER addUser(@RequestBody USER user) {
        return service.saveuser(user);
    }

    @PostMapping("/addUsers")
    public List<USER> addUsers(@RequestBody List<USER> users) {
        return service.saveusers(users);
    }

    @GetMapping("/users")
    public List<USER> findALLUsers() {
        return service.getuser();
    }

//    @GetMapping("/user/login")
//    public USER findByMobileAndPassword(@PathVariable int mobile_number) {
//        return service.getuserById(mobile_number);
//    }

    @GetMapping("/user/{id}")
    public USER findUserById(@PathVariable int id) {
        return service.getuserById(id);
    }

    @GetMapping("/user/login")
    public USER findUserByMobilenumber() {
        usercontroller.isLogin = true;
        return null;
    }

    @GetMapping("/users/{password}")
    public USER findUserByPassword(@PathVariable String password) {
        if(usercontroller.isLogin)
        return service.getuserByPassword(password);
        else
            return null;
    }

    @PostMapping("/update/{id}")
    public USER updateUser(@RequestBody USER user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.deleteuserById(id);
    }



//    public void setUser(List<USER> user) {
//        this.user = user;
//    }
}
