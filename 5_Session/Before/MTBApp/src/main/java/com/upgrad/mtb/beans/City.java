package com.upgrad.mtb.beans;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true, nullable = false)
    private String city;
    @OneToMany(mappedBy = "city", fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    List<Theatre> theatres;

    public City() {
    }

    public City(String city) {
        this.city = city;
    }

    public City(String city, List<Theatre> theatres) {
        this.city = city;
        this.theatres = theatres;
    }

    public City(int id, String city, List<Theatre> theatres) {
        this.id = id;
        this.city = city;
        this.theatres = theatres;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", theatres=" + theatres +
                '}';
    }
}
