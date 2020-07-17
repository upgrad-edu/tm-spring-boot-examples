package com.upgrad.project.main;

import com.upgrad.project.services.HotelService;
import com.upgrad.project.services.KitchenService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

       //TODO students
        // Write Code for creation of Spring IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");

        //Write a code for HotelService service invocation
        HotelService hotelService = (HotelService) context.getBean("hotelService");
        System.out.println(hotelService.acceptOrder("Masala Dosa"));


  }
}
