package com.upgrad.mtb.services;

import com.upgrad.mtb.beans.City;
import com.upgrad.mtb.beans.Customer;
import com.upgrad.mtb.beans.UserType;

import com.upgrad.mtb.daos.CustomerDAO;
import com.upgrad.mtb.daos.UserTypeDAO;
import com.upgrad.mtb.dto.CustomerDTO;
import com.upgrad.mtb.exceptions.CustomerDetailsNotFoundException;
import com.upgrad.mtb.exceptions.CustomerUserNameExistsException;
import com.upgrad.mtb.exceptions.UserTypeDetailsNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;


@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    @Qualifier("customerDAO")
    CustomerDAO customerDAO;
    @Autowired
    UserTypeService userTypeService;

    @Override
    public Customer acceptCustomerDetails(Customer customer) throws CustomerUserNameExistsException, UserTypeDetailsNotFoundException {

        if(customerDAO.findByUsername(customer.getUsername()).isPresent())
            throw new CustomerUserNameExistsException("This username already exists please choose another : " + customer.getUsername());
            return customerDAO.save(customer);
    }

    @Override
    public Customer getCustomerDetails(int id) throws CustomerDetailsNotFoundException {

        System.out.println("Get customer details ");
        Customer customer = customerDAO.findById(id).orElseThrow(
                ()->  new CustomerDetailsNotFoundException("Customer not found for id" + id));
        return customer;
    }

    /*@Override
    public UserDetails loadCustomerDetails(String username) throws CustomerDetailsNotFoundException {
        Customer customer = customerDAO.findByUsername(username).orElseThrow(
                ()->  new CustomerDetailsNotFoundException("Customer not found for " + username));

        return  new User(customer.getUsername(), customer.getPassword() , new ArrayList<>());

    }*/

    public Customer getCustomerDetailsByUsername(String username) throws CustomerDetailsNotFoundException {
        Customer customer = customerDAO.findByUsername(username).orElseThrow(
                ()->  new CustomerDetailsNotFoundException("Customer not found for username" + username));
        return customer;
    }

    @Override
    public Customer updateCustomerDetails(int initialCustomerId, Customer customer) throws CustomerDetailsNotFoundException, UserTypeDetailsNotFoundException {
        Customer initialCustomer = getCustomerDetails(initialCustomerId);
        System.out.println("Initial customer details : " + initialCustomer.toString());
        initialCustomer.setFirstName(customer.getFirstName());
        initialCustomer.setLastName(customer.getLastName());
        initialCustomer.setPassword(customer.getPassword());
        initialCustomer.setDateOfBirth(customer.getDateOfBirth());
        initialCustomer.setUserType(customer.getUserType());
        initialCustomer.setPhoneNumbers(customer.getPhoneNumbers());
        initialCustomer.setBookings(customer.getBookings());
        customerDAO.save(initialCustomer);
        System.out.println("New city details :" + getCustomerDetails(initialCustomerId).toString());
        return initialCustomer;
    }

    public Customer updateCustomerDetails(Customer customer){
        return customerDAO.save(customer);
    }

}
