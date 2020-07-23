package com.upgrad.mtb.beans;

import javax.persistence.*;

@Entity
public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String type;
    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "carId")
    private Car car;

    public Engine() {}

    public Engine( String type) {

        this.type = type;
    }

    public Engine( String type, Car car) {
        this.type = type;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


}
