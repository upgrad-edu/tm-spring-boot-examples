package com.upgrad.project.services;

import org.springframework.beans.factory.annotation.Qualifier;

public class HotelServiceImpl implements HotelService{


    //Setter, Constructor, Field  @Autowired  TODO
   private KitchenService kitchenService;

   //Property file TODO
   private  String hotelName;

    public HotelServiceImpl() {
    }

    //Constructor injection TODO


    public HotelServiceImpl(KitchenService kitchenService, String hotelName) {
        this.kitchenService = kitchenService;
        this.hotelName = hotelName;
    }

    //setter injection todo
    public void setKitchenService(KitchenService kitchenService) {
        this.kitchenService = kitchenService;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String acceptOrder(String order) {

        return kitchenService.prepareFood(order)+" "+" and ready to serve by "+hotelName;
    }
}
