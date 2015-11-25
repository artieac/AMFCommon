package com.alwaysmoveforward.oauth.datalayer.repositories;

import com.alwaysmoveforward.DomainModel.Consumer;
import com.alwaysmoveforward.oauth.datalayer.DTOs.ConsumerDTO;
import com.google.common.base.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by acorrea on 11/25/2015.
 */
public class ConsumerRepository implements IConsumerRepository {
    @Override
    public Optional<Consumer> findByConsumerKey(@Param String consumerKey) {
        String queryString = "SELECT * FROM Consumer c " +
                "WHERE c.ConsumerKey = :consumerKey";

        Query query = getEntityManager().createQuery(queryString);

        query.setParameter("lastName", lastName);
        return query.getResultList();
    }

    @Override
    public List<Consumer> GetByContactEmail(String contactEmail) {
        return null;
    }

    @Override
    public Consumer GetByRequestToken(String requestToken) {
        return null;
    }

    @Override
    public <S extends Consumer> S save(S s) {
        return null;
    }

    @Override
    public <S extends Consumer> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Consumer findOne(String s) {
        return null;
    }

    @Override
    public boolean exists(String s) {
        return false;
    }

    @Override
    public Iterable<Consumer> findAll() {
        return null;
    }

    @Override
    public Iterable<Consumer> findAll(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void delete(Consumer consumer) {

    }

    @Override
    public void delete(Iterable<? extends Consumer> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
