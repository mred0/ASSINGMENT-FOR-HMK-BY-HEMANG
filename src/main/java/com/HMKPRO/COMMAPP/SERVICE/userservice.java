package com.HMKPRO.COMMAPP.SERVICE;

import com.HMKPRO.COMMAPP.ENTITY.USER;
import com.HMKPRO.COMMAPP.REPOSITORY.userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userservice {
    @Autowired
    private userrepo repository;

    public USER saveuser(USER user) {
      return  repository.save(user);
    }
    public List<USER> saveusers(List<USER> users) {
      return  repository.saveAll(users);
    }

    public List<USER> getuser(){
        return repository.findAll();
    }

    public USER getuserById(int id){
        return repository.findById(id).orElse(null);
    }

//    public USER getuserByMobilenumber(int mobile_number){
//        return repository.findByMobileNumber();}
//
//    public USER getuserByName(String name){
//        return repository.findByName(name);
//    }

    public String deleteuserById(int id){
        repository.deleteById(id);
        return "USER Removed !! "+ id;
    }


//    public void login(USER appuser){
////        repository.findByMobileAndPassword();
//    }


//        public USER deleteuserByName(String name){
//        return repository.deleteByName(name);
//    }

    public USER updateUser(USER user){
        USER existingUSER=repository.findById(user.getid()).orElse(null);
        existingUSER.setName(user.getName());
        existingUSER.setMobileNumber(user.getMobileNumber());
        existingUSER.setPassword(user.getPassword());
        existingUSER.setEmail(user.getEmail());
        return repository.save(existingUSER);
    }

    public USER getuserByPassword(String password) {

            return repository.findByPassword(password);
    }

//    public USER getuserByMobilenumbeAndPassword() {
//        return repository.findByMobileAndPassword();
//    }
}


//    public USER getuserByMobilenumbeAndPassword(int mobile_number,String password) {
//    }
//}
