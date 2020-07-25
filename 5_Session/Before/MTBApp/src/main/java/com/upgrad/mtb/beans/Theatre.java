package com.upgrad.mtb.beans;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.IndexColumn;

import javax.persistence.*;
import java.util.List;

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
    private int noOfSeats;
    @Column( nullable = false)
    private int ticketPrice;

    @ManyToOne
    private City city;

    @OrderColumn
    @OneToMany(mappedBy = "theatre" , fetch = FetchType.EAGER)
    List<Booking> bookings;

    @Fetch(value = FetchMode.SELECT)
    @ManyToMany(mappedBy = "theatres" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private List<Movie> movies;

    public Theatre(){}

    public Theatre( String theatreName, int ticketPrice) {
        this.id = id;
        this.theatreName = theatreName;
        this.ticketPrice = ticketPrice;
    }

    public Theatre(String theatreName, int noOfSeats, int ticketPrice, City city, List<Booking> bookings, List<Movie> movies) {
        this.theatreName = theatreName;
        this.noOfSeats = noOfSeats;
        this.ticketPrice = ticketPrice;
        this.city = city;
        this.bookings = bookings;
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "id=" + id +
                ", theatreName='" + theatreName + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", ticketPrice=" + ticketPrice +
                ", city=" + city +
                '}';
    }
}
