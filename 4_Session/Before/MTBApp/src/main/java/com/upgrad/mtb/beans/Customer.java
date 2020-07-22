package com.upgrad.mtb.beans;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column( nullable = false)
    private String firstName;
    private String lastName;
    @Column( nullable = false)// as we are developing web application so validation of data need to be done at client side or application level and not at database level //
    private String username;
    @Column( nullable = false)// as we are developing web application so validation of data need to be done at client side or application level and not at database level //
    private String password;
    @Column( nullable = false)
    private Date dateOfBirth;

    public Customer() { }

    public Customer(String firstName, String lastName, String username, String password, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }


}
