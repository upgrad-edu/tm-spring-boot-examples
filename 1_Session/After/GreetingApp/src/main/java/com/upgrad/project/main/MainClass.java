package com.upgrad.project.main;

import com.upgrad.project.services.GreetingService;
import com.upgrad.project.services.TimeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import java.net.SocketOptions;

public class MainClass {
    public static void main(String[] args) {

        //Spring IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");

        //Greeting Service invocation
        GreetingService greetingService =(GreetingService) context.getBean("greetingService");
        System.out.println(greetingService.greetUser("Akshay","Kumar"));

        //Time service invocation
        TimeService timeService = (TimeService)context.getBean("timeService");
        System.out.println("The current time is :-  "+timeService.getCurrentTime());

    }
}
