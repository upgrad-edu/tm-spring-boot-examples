package com.upgrad.mtb.daos;

import com.upgrad.mtb.beans.Movie;
import com.upgrad.mtb.beans.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("theatreDAO")
public interface TheatreDAO  {
    Theatre saveTheatre(Theatre theatre);
    Theatre updateTheatre(Theatre theatre);
    Theatre deleteTheatre(Theatre theatre);
    Optional<Theatre> getTheatre(int id);
    List<Theatre> getAllTheatre();
}
