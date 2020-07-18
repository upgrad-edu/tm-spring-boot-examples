package com.upgrad.project.main;

import com.upgrad.project.services.HotelService;
import com.upgrad.project.services.KitchenService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
       //TODO students
        /*
            Maven Hands-on Break up
            1)Add "spring core.5.0.8.RELEASE & spring-context.5.0.8.RELEASE dependencies in side pom.xml
        */

        /*
            Spring Hands-on Todo
            1)Add "projectBeans.xml" inside resources folder
            2)Create HotelServiceImpl class inside "com.upgrad.project.services" package
            3)Implements HotelService interface inside HotelServiceImpl class
            4)Define HotelServiceImpl bean inside "projectBeans.xml" file using <bean> tag
            5)Create Spring Container "ApplicationContext" inside MainClass main method
            6)Get the HotelService bean from spring IoC container
            7)Invoke HotelService service by passing input value to service method
            8)Execute main method
        */

        // Write Code for creation of Spring IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");

        //Write a code for HotelService service invocation
        HotelService hotelService = (HotelService)context.getBean("hotelService");
        System.out.println(hotelService.acceptOrder("Masala Dosa"));

        /*
            Spring Hands-on Todo

            1)Create KitchenServiceImpl class inside "com.upgrad.project.services" package
            3)Implements KitchenService interface inside KitchenServiceImpl class
            4)Define KitchenServiceImpl bean inside "projectBeans.xml" file using <bean> tag
            5)Get the KitchenService bean from spring IoC container
            6)Invoke KitchenService service by passing input value to service method
            7)Execute main method
        */

        // Write a code for KitchenService

        KitchenService kitchenService = (KitchenService)context.getBean("kitchenService");
        System.out.println(kitchenService.prepareFood("Masala Dosa"));

    }
}
