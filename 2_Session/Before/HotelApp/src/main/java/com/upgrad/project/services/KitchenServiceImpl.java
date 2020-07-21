package com.upgrad.project.services;

import org.springframework.stereotype.Component;

@Component("kitchenService")
public class KitchenServiceImpl implements KitchenService{
    public String prepareFood(String order) {
        return order + " is ready for you";
    }
}
