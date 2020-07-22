package com.upgrad.mtb.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column( nullable = false, unique = true)
    private String theatreName;
    @Column( nullable = false)
    private int ticketPrice;

    public Theatre(){}

    public Theatre( String theatreName, int ticketPrice) {

        this.theatreName = theatreName;
        this.ticketPrice = ticketPrice;
    }
}
