package com.upgrad.mtb.beans;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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
    @Column( nullable = false , unique = true)
    private String username;
    @Column( nullable = false)
    private String password;
    @Column( nullable = false)
    private Date dateOfBirth;
    @Column( nullable = false)
    
    @ElementCollection
    private List<String> phoneNumbers;


    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "customer" )
    List<Booking> bookings;
    @ManyToOne(fetch = FetchType.EAGER)
    UserType userType;

    public Customer() {
    }
    public Customer(String firstName, String lastName, String username,  String password, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumbers = phoneNumbers;
        this.bookings = bookings;
        this.userType = userType;
    }

    public Customer(String firstName, String lastName, String username, String password, Date dateOfBirth, List<String> phoneNumbers, List<Booking> bookings, UserType userType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumbers = phoneNumbers;
        this.bookings = bookings;
        this.userType = userType;
    }

    public Customer(int id, String firstName, String lastName, String username, String password, Date dateOfBirth, List<String> phoneNumbers, List<Booking> bookings, UserType userType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumbers = phoneNumbers;
        this.bookings = bookings;
        this.userType = userType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return firstName.equals(customer.firstName) &&
                lastName.equals(customer.lastName) &&
                username.equals(customer.username) &&
                password.equals(customer.password) &&
                dateOfBirth.equals(customer.dateOfBirth) &&
                phoneNumbers.equals(customer.phoneNumbers) &&
                bookings.equals(customer.bookings) &&
                userType.equals(customer.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, username, password, dateOfBirth, phoneNumbers, bookings, userType);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumbers=" + phoneNumbers +
                ", bookings=" + bookings +
                ", userType=" + userType +
                '}';
    }
}
