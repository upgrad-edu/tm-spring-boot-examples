package com.upgrad.project.services;

public class GreetingServiceImpl1 implements GreetingService{
    public String greetUser(String firstName, String lastName) {
        return "Welcome to Spring Session "+firstName+" "+lastName;
    }
}
