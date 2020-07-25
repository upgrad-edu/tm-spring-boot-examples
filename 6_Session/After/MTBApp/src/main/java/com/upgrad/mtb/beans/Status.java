package com.upgrad.mtb.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true, nullable = false)
    private String status;
    @OneToMany(mappedBy = "status" , fetch = FetchType.EAGER)
    List<Movie> movies;

    public Status(){ }

    public Status(int id, String status){
        this.id = id;
        this.status = status;
    }

    public Status(String status){
        this.status = status;
    }
}
