package com.upgrad.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotelService")
public class HotelServiceImpl implements HotelService{


    //Setter, Constructor, Field  @Autowired  TODO
    @Autowired
   private KitchenService kitchenService;

   //Property file TODO
    @Value("${hotelName}")
   private  String hotelName;

public HotelServiceImpl(){}

    //Constructor injection TODO
  public HotelServiceImpl(KitchenService kitchenService, String hotelName) {
        this.kitchenService = kitchenService;
        this.hotelName = hotelName;
    }


    //setter injection todo
    public void setKitchenService(KitchenService kitchenService) {
        this.kitchenService = kitchenService;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String acceptOrder(String order) {
        //call KitchenService prepareFood(String order);
        return hotelName+ " Welcome you and "+kitchenService.prepareFood(order);
    }
}
