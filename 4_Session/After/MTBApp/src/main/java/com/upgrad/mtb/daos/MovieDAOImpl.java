package com.upgrad.mtb.daos;

import com.upgrad.mtb.beans.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Repository ("movieDAO")
public class MovieDAOImpl implements MovieDAO{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public Movie saveMovie(Movie movie) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(movie);
        entityManager.getTransaction().commit();
        entityManager.close();
        return movie;
    }

   /* @Transactional
    @Override
    public Movie saveMovie(Movie movie) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.persist(movie);
        entityManager.close();
        return movie;
    }*/
    @Override
    public Movie updateMovie(Movie movie) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(movie);
        entityManager.getTransaction().commit();
        entityManager.close();
        return movie;
    }

    @Override
    public Movie deleteMovie(Movie movie) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        movie=entityManager.find(Movie.class,movie.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(movie);
        entityManager.getTransaction().commit();
        entityManager.close();
        return movie;
    }

    @Override
    public Optional<Movie> getMovie(int id) {
        Optional<Movie> optionalMovie = Optional.ofNullable(entityManagerFactory.createEntityManager().find(Movie.class,id));
        return optionalMovie ;
    }

    @Override
    public List<Movie> getAllMovies() {
        Query query = entityManagerFactory.createEntityManager().createQuery("from Movie m",Movie.class);
        return (List<Movie>)query.getResultList();
    }
}
