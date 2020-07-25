package com.upgrad.mtb.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String type;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="carid")
    private Car car;

    public Engine(){

    }
    public Engine( String type) {
        this.type = type;
    }

    public Engine(int id, String type, Car car) {
        this.id = id;
        this.type = type;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
