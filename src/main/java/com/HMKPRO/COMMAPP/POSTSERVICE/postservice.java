package com.HMKPRO.COMMAPP.POSTSERVICE;

import com.HMKPRO.COMMAPP.POSTENTITY.POST;
import com.HMKPRO.COMMAPP.POSTREPOSITORY.postrepo;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class postservice {

    @Autowired
    private postrepo postrepository;

    public POST savepost(POST post) {
        return  postrepository.save(post);
    }
    public List<POST> saveposts(List<POST> posts) {
        return  postrepository.saveAll(posts);
    }

    public List<POST> getpost(){
        return postrepository.findAll();
    }

    public POST getpostById(int postid){
        return postrepository.findByPostid(postid);
    }

    public POST getpostByurl(String url){
        return postrepository.findByUrl(url);
    }

    public POST getpostByDate(int date){
        return postrepository.findByDate(date);
    }

    public String deletepostById(int postid){
        postrepository.deleteByPostid(postid);
        return "Post Removed !! "+ postid;
    }



}
