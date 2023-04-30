package com.GeeksterTest.Weekly.repository;

import com.GeeksterTest.Weekly.model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Irepository extends CrudRepository<Users,Long> {


   public Users findByEmployerName(String userName);

   @Query(value = "SELECT * FROM USERS_TABLE where USER_ID =:USER_ID",nativeQuery = true)
   public Users findByUSER_ID(Long USER_ID);


   @Query(value = "delete from USERS_TABLE where USER_ID =:id",nativeQuery = true)
   public void deletedById(Long id);
}
