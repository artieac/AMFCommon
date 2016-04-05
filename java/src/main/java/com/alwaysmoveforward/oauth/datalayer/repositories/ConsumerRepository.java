package com.alwaysmoveforward.oauth.datalayer.repositories;

import com.alwaysmoveforward.oauth.DomainModel.Consumer;
import com.alwaysmoveforward.oauth.datalayer.Mapper.ConsumerMapper;
import com.alwaysmoveforward.oauth.datalayer.tableentities.ConsumerEntity;
import com.alwaysmoveforward.oauth.datalayer.DAO.IConsumerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by acorrea on 11/30/2015.
 */
@Component("ConsumerRepository")
public class ConsumerRepository implements IConsumerRepository {
    @Autowired
    IConsumerDAO consumerDAO;

    @Override
    public List<Consumer> findAll(){
        Iterable<ConsumerEntity> dtoList = consumerDAO.findAll();
        return ConsumerMapper.instance.mapDTOListToDomainList(dtoList);
    }

    @Override
    public Consumer findByConsumerKey(String consumerKey) {
        ConsumerEntity dto = consumerDAO.findByConsumerKey(consumerKey);
        return ConsumerMapper.instance.mapDTOToDomain(dto);
    }

    @Override
    public List<Consumer> findByContactEmail(String contactEmail){
        List<ConsumerEntity> dtoList = consumerDAO.findByContactEmail(contactEmail);
        return ConsumerMapper.instance.mapDTOListToDomainList(dtoList);
    }

    @Override
    public Consumer findByRequestToken(String requestToken){
        ConsumerEntity dto = consumerDAO.findByRequestToken(requestToken);
        return ConsumerMapper.instance.mapDTOToDomain(dto);
    }

    @Override
    public Consumer save(Consumer consumer){
        Consumer retVal = consumer;

        ConsumerEntity dto = consumerDAO.findOne(consumer.getConsumerKey());

        if(dto!=null){
            dto = ConsumerMapper.instance.mapDominToDTO(consumer, dto);
            dto = consumerDAO.save(dto);

            retVal = ConsumerMapper.instance.mapDTOToDomain(dto, retVal);
        }

        return retVal;
    }

    @Override
    public void delete(String consumerKey){

    }

    @Override
    public void delete(Consumer consumer){

    }
}
