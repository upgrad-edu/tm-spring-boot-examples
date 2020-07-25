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
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(unique = true , nullable = false)
    String userType;
    @OneToMany(mappedBy = "userType" , fetch = FetchType.EAGER)
    List<Customer> customer;

    public UserType() {
    }

    public UserType(int id, String userType) {
        this.id = id;
        this.userType = userType;
    }

    public UserType(String userType){
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "id=" + id +
                ", userType='" + userType + '\'' +
                '}';
    }
}
