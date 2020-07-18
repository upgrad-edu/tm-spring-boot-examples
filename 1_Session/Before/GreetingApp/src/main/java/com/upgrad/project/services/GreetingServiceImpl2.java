package com.upgrad.project.services;

public class GreetingServiceImpl2 implements GreetingService {
    public String greetUser(String firstName, String lastName) {
        return "Welcome to Java Session "+firstName+" "+lastName;
    }
}
