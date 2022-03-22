package com.HMKPRO.COMMAPP.POSTCONTROLLER;

import com.HMKPRO.COMMAPP.ENTITY.USER;
import com.HMKPRO.COMMAPP.POSTENTITY.POST;
import com.HMKPRO.COMMAPP.POSTSERVICE.postservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class postcontroller {
    @Autowired
    private postservice ptservice;

    @PostMapping("/addPost")
    public POST addPost(@RequestBody POST post) {
        return ptservice.savepost(post);
    }

    @PostMapping("/addPosts")
    public List<POST> addPosts(@RequestBody List<POST> posts) {
        return ptservice.saveposts(posts);
    }

    @GetMapping("/posts")
    public List<POST> findALL() {
        return ptservice.getpost();
    }

    @GetMapping("/post/{postid}")
    public POST findPostById(@PathVariable int postid) {
        return ptservice.getpostById(postid);
    }

    @GetMapping("/post/date/{date}")
    public POST findByDate(@PathVariable int date) {
        return ptservice.getpostByDate(date);
    }

    @GetMapping("/post/{url}")
    public POST findByUrl(@PathVariable String url) {
        return ptservice.getpostByurl(url);
    }

//    @PostMapping("/update")
//    public USER updateUser(@RequestBody USER user) {
//        return ptservice.updateUser(user);
//    }

    @DeleteMapping("/deletes/{postid}")
    public String deleteBypostId(@PathVariable int postid) {
        return ptservice.deletepostById(postid);
    }
}
