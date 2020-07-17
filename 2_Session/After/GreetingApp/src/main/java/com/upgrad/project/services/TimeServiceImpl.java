package com.upgrad.project.services;

import org.springframework.stereotype.Component;

@Component("timeService")
public class TimeServiceImpl implements TimeService{
    public int getCurrentTime() {
        return 10;
    }
}
