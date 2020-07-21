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
    @Column( nullable = false , unique = true ,insertable = false, columnDefinition = "varchar(400) default 'tempuser'")
    private String username;
    @Column( nullable = false,insertable = false,columnDefinition = "varchar(400)check (length(password)>6)")
    private String password;
    @Column( nullable = false)
    private Date dateOfBirth;


}
