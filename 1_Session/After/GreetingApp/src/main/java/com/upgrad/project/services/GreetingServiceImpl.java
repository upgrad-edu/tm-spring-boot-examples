package com.upgrad.project.services;

public class GreetingServiceImpl implements GreetingService{
    public String greetUser(String firstName, String lastName) {
        return "Welcome "+firstName+" "+lastName;
    }
}
