package com.alwaysmoveforward.oauth.datalayer.DAO;

import com.alwaysmoveforward.oauth.datalayer.tableentities.ConsumerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acorrea on 11/30/2015.
 */
@Repository
public interface IConsumerDAO extends CrudRepository<ConsumerEntity, String> {

    @Query("SELECT c FROM ConsumerEntity c where c.consumerKey = :consumerKey")
    ConsumerEntity findByConsumerKey(@Param("consumerKey") String consumerKey);

    @Query("SELECT c FROM ConsumerEntity c where c.contactEmail = :contactEmail")
    List<ConsumerEntity> findByContactEmail(@Param("contactEmail") String contactEmail);

    @Query("SELECT c FROM ConsumerEntity c where c.contactEmail = :requestToken")
    ConsumerEntity findByRequestToken(@Param("requestToken") String requestToken);
}
