package com.upgrad.project.main;
import com.upgrad.project.factories.GreetingServiceFactory;
import com.upgrad.project.factories.TimeServiceFactory;
import com.upgrad.project.services.GreetingService;
import com.upgrad.project.services.GreetingServiceImpl1;
import com.upgrad.project.services.TimeService;
import com.upgrad.project.services.TimeServiceImpl1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        //TODO For Trainer
       /* //Greeting Service invocation

        //Tight coupling
        GreetingService service1 = new GreetingServiceImpl1();
        System.out.println(service1.greetUser("Akshy","Kumar"));

        //factory pattern //loose coupling

        GreetingServiceFactory factory =new GreetingServiceFactory();

        GreetingService service2 = factory.getGreetingService("2");
        System.out.println(service2.greetUser("Akshy","Kumar"));

        //TODO For Student
        *//*  1)Create “TimeServiceImpl ” class  inside “com.upgrad.project.services” package
            2)Implements “TimeService” interface inside “TimeServiceImpl” class
            3)Create TimeServiceFactory class inside “com.upgrad.project.factories” package
            4)Obtain TimeService instance using TimeServiceFactory class  inside  MainClass main() method
            5)Invoke TimeService
            5)Execute application *//*


        //Tight coupling
        TimeService timeService1 = new TimeServiceImpl1();
        System.out.println(" Current time :- "+timeService1.getCurrentTime());

        //loose coupling  factory pattern

        //code expected
        TimeServiceFactory timeServiceFactory = new TimeServiceFactory();
        TimeService timeService2 =timeServiceFactory.getTimeService("2");

        System.out.println("current time :- "+timeService2.getCurrentTime());*/


        // Spring Framework Container creation

        //Spring attached to java application
        //spring will read xml file
        //String IOC container will be created
        //Spring IOC container will create spring beans
        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");


        //greeting Services bean
        GreetingService service = (GreetingService) context.getBean("greetingService");
        System.out.println(service.greetUser("Akshay","kumar"));

        // timeServices service

        TimeService timeServices = (TimeService) context.getBean("timeService");
        System.out.println("current time :-" + timeServices.getCurrentTime());

    }
}
