package com.upgrad.project.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("greetingService")
public class GreetingServiceImpl1 implements GreetingService {

    //Field TODO
    @Autowired
    private TimeService timeService;

    @Value("${companyName}")
    private String companyName;


    //for Field @Autowiring default constructor is must
    public GreetingServiceImpl1() { }

    //constructor TODO
    public GreetingServiceImpl1(TimeService timeService, String companyName) {
        this.timeService = timeService;
        this.companyName = companyName;
    }

    //setter TODO
    public TimeService getTimeService() {
        return timeService;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String greetUser(String firstName, String lastName) {
        return companyName+ " Welcome you "+firstName+" "+lastName;
    }
}
