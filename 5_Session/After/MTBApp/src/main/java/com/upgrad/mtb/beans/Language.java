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
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true ,nullable = false)
    private String language;
    @OneToMany(mappedBy = "language" , fetch = FetchType.EAGER)
    List<Movie> movies;

    public Language() { }

    public Language(String language){
        this.language = language;
    }
}
