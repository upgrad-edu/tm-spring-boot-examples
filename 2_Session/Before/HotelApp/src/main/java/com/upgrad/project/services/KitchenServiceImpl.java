package com.upgrad.project.services;

public class KitchenServiceImpl implements KitchenService{
    public String prepareFood(String order) {
        return order + " is ready to serve to customer";
    }
}
