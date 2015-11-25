package com.alwaysmoveforward.oauth.datalayer.repositories;

import com.alwaysmoveforward.DomainModel.Consumer;
import com.google.common.base.Optional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by acorrea on 11/25/2015.
 */
public interface IConsumerRepository extends CrudRepository<Consumer, String> {
    /// <summary>
    /// Get a ConsumerDTO by its key
    /// </summary>
    /// <param name="consumerKey">The consumer key value</param>
    /// <returns>The consumer if found, null otherwise</returns>
    Optional<Consumer> findByConsumerKey(String consumerKey);

    /// <summary>
    /// Find all Consumers with the same email address
    /// </summary>
    /// <param name="contactEmail">The email address to search for</param>
    /// <returns>A list of all found Consumers</returns>
    List<Consumer> findByContactEmail(String contactEmail);

    /// <summary>
    /// Get a consumer instance by a request token
    /// </summary>
    /// <param name="consumerKey">The request token to search for</param>
    /// <returns>An instance of a consumer</returns>
    Consumer findByRequestToken(String requestToken);
}
