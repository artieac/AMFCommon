package com.alwaysmoveforward.oauth.datalayer.repositories;

import com.alwaysmoveforward.oauth.DomainModel.Consumer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by acorrea on 11/30/2015.
 */
public interface IConsumerRepository  {
    List<Consumer> findAll();

    Consumer findByConsumerKey(String consumerKey);

    List<Consumer> findByContactEmail(String contactEmail);

    Consumer findByRequestToken(String requestToken);

    Consumer save(Consumer consumer);

    void delete(String consumerKey);

    void delete(Consumer consumer);
}
