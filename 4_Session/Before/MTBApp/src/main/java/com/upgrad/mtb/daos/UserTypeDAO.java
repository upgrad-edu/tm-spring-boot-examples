package com.upgrad.mtb.daos;

import com.upgrad.mtb.beans.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserTypeDAO extends  JpaRepository<UserType,Integer>{

}
