package com.upgrad.project.factories;

import com.upgrad.project.services.GreetingService;

import com.upgrad.project.services.GreetingServiceImpl1;
import com.upgrad.project.services.GreetingServiceImpl2;

public class GreetingServiceFactory {

    public GreetingService getGreetingService(String type){
        if(type.equals("1"))
            return  new GreetingServiceImpl1();
        else if(type.equals("2"))
            return  new GreetingServiceImpl2();
        else
            return  null;
    }
}
