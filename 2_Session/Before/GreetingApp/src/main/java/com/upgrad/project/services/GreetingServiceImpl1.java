package com.upgrad.project.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("greetingService")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GreetingServiceImpl1 implements GreetingService {

    //Field TODO

    //auto wiring using Filed  setter , constructor   --->

    @Autowired
    private TimeService timeService;

    @Value("${companyName}")
    private String companyName;


    //for Field @Autowiring default constructor is must
    public GreetingServiceImpl1() {
            System.out.println("GreetingServiceImpl1()");
    }

    //constructor TODO

   // @Autowired //constructor auto wiring using @Autowired
    public GreetingServiceImpl1(TimeService timeService, String companyName) {
        this.timeService = timeService;
        this.companyName = companyName;
    }


    //setter TODO

    public TimeService getTimeService() {
        return timeService;
    }


    //@Autowired  //setter auto wiring using @Autowired
    public void setTimeService(TimeService timeService) {
        this.timeService = timeService;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }




    public String greetUser(String firstName, String lastName) {
        int time = timeService.getCurrentTime();
        if(time >=0 && time <=12 )
            return companyName + " Good morning " + firstName + " " + lastName;
        else if(time >=13 && time <16 )
            return companyName + " Good after noon " + firstName + " " + lastName;
        else
            return companyName + " Good evening " + firstName + " " + lastName;
        }

    }
