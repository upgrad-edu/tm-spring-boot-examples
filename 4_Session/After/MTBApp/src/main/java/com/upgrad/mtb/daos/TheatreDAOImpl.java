package com.upgrad.mtb.daos;

import com.upgrad.mtb.beans.Movie;
import com.upgrad.mtb.beans.Theatre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Repository("theatreDAO")
public class TheatreDAOImpl implements TheatreDAO{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public Theatre saveTheatre(Theatre theatre) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(theatre);
        entityManager.getTransaction().commit();
        entityManager.close();
        return theatre;
    }

    @Override
    public Theatre updateTheatre(Theatre theatre) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        theatre =entityManager.find(Theatre.class,theatre.getId());
        entityManager.getTransaction().begin();
        entityManager.merge(theatre);
        entityManager.getTransaction().commit();
        entityManager.close();
        return theatre;
    }

    @Override
    public Theatre deleteTheatre(Theatre theatre) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        theatre=entityManager.find(Theatre.class,theatre.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(theatre);
        entityManager.getTransaction().commit();
        entityManager.close();
        return theatre;
    }

    @Override
    public Optional<Theatre> getTheatre(int id) {
        Optional<Theatre> optionalTheatre = Optional.ofNullable(entityManagerFactory.createEntityManager().find(Theatre.class,id));
        return optionalTheatre ;
    }

    @Override
    public List<Theatre> getAllTheatre() {
        Query query = entityManagerFactory.createEntityManager().createQuery("from Theatre t",Theatre.class);
        return (List<Theatre>)query.getResultList();
    }
}
