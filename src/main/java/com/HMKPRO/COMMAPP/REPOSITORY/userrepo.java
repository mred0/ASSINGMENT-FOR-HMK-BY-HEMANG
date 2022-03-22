package com.HMKPRO.COMMAPP.REPOSITORY;

import com.HMKPRO.COMMAPP.ENTITY.USER;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userrepo extends JpaRepository<USER,Integer> {


//    static void findByMobileAndPassword( password) {
//    }

//    USER findByMobileNumberAndPassword();


//

//

    USER findByMobileNumber(int mobile);

    USER findByName(String name);

    USER findByPassword(String password);
}
