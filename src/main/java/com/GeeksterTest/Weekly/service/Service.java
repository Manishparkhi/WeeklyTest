package com.GeeksterTest.Weekly.service;

import com.GeeksterTest.Weekly.model.Users;
import com.GeeksterTest.Weekly.repository.Irepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Optional;

@org.springframework.stereotype.Service

public class Service {
    @Autowired
     Irepository Irepo;
    public Iterable<Users> getAllUSer() {
       return Irepo.findAll();
    }

    public String addUser(Users user) {
        Irepo.save(user);

        return "update Successfully";
    }

    public void updateInfo(Long id ,Users user) {
      Irepo.save(user);
    }

    public void deletUserId(Long id) {
        Irepo.deletedById(id);
    }

    public Optional<Users> findById(Long id) {
       return Irepo.findById(id);
    }

    public Users findUserName(String userName) {
        return Irepo.findByEmployerName(userName);
    }

    public Users findByUSER_ID(Long USER_ID) {
        return Irepo.findByUSER_ID(USER_ID);
    }
}
