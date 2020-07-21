package com.upgrad.mtb.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Movie {

        @Id @GeneratedValue(strategy = GenerationType.AUTO)

        @Column(name = "movie_id")

        private int id;

        @Column(name ="movie_name" , nullable = false, unique = true)
        private String name;

        @Column(name="movie_desc", nullable = false)
        private String  desc  ;

        @Column(name="release_date" ,nullable = false)
        private Date releaseDate;

        @Column(name="duration" ,nullable = false, columnDefinition = "number check(duration>60)")
        private int duration;

        @Column(name="cover_photo_url",nullable = false)
        private String coverPhotoUrl ;

        @Column(name="trailer_url",nullable = false)
        private String trailerUrl ;
}




  /*  movie_name	VARCHAR2(50)	NOT NULL, UNIQUE
    movie_desc	VARCHAR2(500)	NOT NULL
    release_date	DATE	NOT NULL
    duration	NUMBER(3)	NOT NULL, CHECK (duration> 60)
        cover_photo_url	VARCHAR2(500)	NOT NULL
        trailer_url	VARCHAR2(500)	NOT NULL*/