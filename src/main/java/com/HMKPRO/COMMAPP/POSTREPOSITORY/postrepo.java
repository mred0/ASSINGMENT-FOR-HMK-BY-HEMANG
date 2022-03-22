package com.HMKPRO.COMMAPP.POSTREPOSITORY;

import com.HMKPRO.COMMAPP.POSTENTITY.POST;
import org.springframework.data.jpa.repository.JpaRepository;

public interface postrepo extends JpaRepository<POST,String> {

    POST findByPostid(int postid);

    POST findByUrl(String url);

    POST findByDate(int date);

    void deleteByPostid(int postid);
}
