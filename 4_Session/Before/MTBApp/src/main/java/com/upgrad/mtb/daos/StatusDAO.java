package com.upgrad.mtb.daos;

import com.upgrad.mtb.beans.Status;
import com.upgrad.mtb.beans.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface StatusDAO extends JpaRepository<Status,Integer> {

}
