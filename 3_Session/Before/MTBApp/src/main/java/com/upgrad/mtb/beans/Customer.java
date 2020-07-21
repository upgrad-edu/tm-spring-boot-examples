package com.upgrad.mtb.beans;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@Entity
public class Customer {
    @Id                                 // each entity need to identify unique
    @Column(name = "customer_id")

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    @Column(name = "first_name",nullable = false)
    private String firstName ;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false , columnDefinition ="varchar(400)check (length(password)>6)")
    private String password;

    @Column(nullable = false)
    private Date dateOfBirth;


}
