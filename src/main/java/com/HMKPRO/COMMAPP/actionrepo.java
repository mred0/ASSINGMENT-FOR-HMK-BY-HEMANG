package com.HMKPRO.COMMAPP;

import com.HMKPRO.COMMAPP.ACTENTITY.ACTION;
import com.HMKPRO.COMMAPP.ENTITY.USER;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface actionrepo extends JpaRepository<ACTION,Integer> {

    List<ACTION> findAll();

    ACTION findByActid(int actid);

//    USER findByUserId(int userid);

//    ACTION saveact(ACTION action);
//
//    List<ACTION> saveacts(List<ACTION> acts);

}
