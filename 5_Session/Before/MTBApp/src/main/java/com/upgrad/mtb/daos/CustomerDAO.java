package com.upgrad.mtb.daos;
import com.upgrad.mtb.beans.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository("customerDAO")
public interface CustomerDAO extends JpaRepository<Customer, Integer> {

}
