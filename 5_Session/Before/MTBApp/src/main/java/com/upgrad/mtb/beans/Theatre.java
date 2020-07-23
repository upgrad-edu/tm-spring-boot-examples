package com.upgrad.mtb.beans;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

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
    @OneToMany(mappedBy = "theatre" , fetch = FetchType.LAZY)
    List<Booking> bookings;
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
}
