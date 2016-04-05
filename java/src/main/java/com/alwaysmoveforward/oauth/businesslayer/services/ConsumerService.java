package com.alwaysmoveforward.oauth.businesslayer.services;

import com.alwaysmoveforward.oauth.DomainModel.Consumer;
import com.alwaysmoveforward.oauth.datalayer.repositories.IConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by acorrea on 12/1/2015.
 */
@Component("ConsumerService")
public class ConsumerService {
//    @Autowired
//    @Qualifier("ConsumerRepository")
//    IConsumerRepository consumerRepository;

//    public List<Consumer> findAll(){
//        return consumerRepository.findAll();
//    }

//    public Consumer findByConsumerKey(String consumerKey){
//        return consumerRepository.findByConsumerKey(consumerKey);
//    }

//    public List<Consumer> findByContactEmail(String contactEmail){
//        return consumerRepository.findByContactEmail(contactEmail);
//    }

//    public Consumer findByRequestToken(String requestToken){
//        return consumerRepository.findByRequestToken(requestToken);
//    }

//    @Transactional
//    public Consumer save(String consumerKey, String newEmail){
//        Consumer retVal = consumerRepository.findByConsumerKey(consumerKey);

//        if(retVal!=null){
//            retVal.setContactEmail(newEmail);
//            retVal = consumerRepository.save(retVal);
//        }

//        return retVal;
//    }
}