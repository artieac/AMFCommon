package com.alwaysmoveforward.oauth.datalayer.Mapper;

import com.alwaysmoveforward.oauth.DomainModel.Consumer;
import com.alwaysmoveforward.oauth.datalayer.tableentities.ConsumerEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-04-05T10:59:31-0400",
    comments = "version: 1.1.0.Beta1, compiler: javac, environment: Java 1.8.0_65 (Oracle Corporation)"
)
public class ConsumerMapperImpl implements ConsumerMapper {

    @Override
    public ConsumerEntity mapDominToDTO(Consumer source) {
        if ( source == null ) {
            return null;
        }

        ConsumerEntity consumerEntity = new ConsumerEntity();

        consumerEntity.setConsumerKey( source.getConsumerKey() );
        consumerEntity.setConsumerSecret( source.getConsumerSecret() );
        consumerEntity.setPublicKey( source.getPublicKey() );
        consumerEntity.setContactEmail( source.getContactEmail() );
        consumerEntity.setName( source.getName() );
        consumerEntity.setAutoGrant( source.getAutoGrant() );
        consumerEntity.setAccessTokenLifetime( source.getAccessTokenLifetime() );

        return consumerEntity;
    }

    @Override
    public ConsumerEntity mapDominToDTO(Consumer source, ConsumerEntity destination) {
        if ( source == null ) {
            return null;
        }

        destination.setConsumerKey( source.getConsumerKey() );
        destination.setConsumerSecret( source.getConsumerSecret() );
        destination.setPublicKey( source.getPublicKey() );
        destination.setContactEmail( source.getContactEmail() );
        destination.setName( source.getName() );
        destination.setAutoGrant( source.getAutoGrant() );
        destination.setAccessTokenLifetime( source.getAccessTokenLifetime() );

        return destination;
    }

    @Override
    public Consumer mapDTOToDomain(ConsumerEntity source) {
        if ( source == null ) {
            return null;
        }

        Consumer consumer = new Consumer();

        consumer.setConsumerKey( source.getConsumerKey() );
        consumer.setConsumerSecret( source.getConsumerSecret() );
        consumer.setPublicKey( source.getPublicKey() );
        consumer.setContactEmail( source.getContactEmail() );
        consumer.setName( source.getName() );
        consumer.setAutoGrant( source.getAutoGrant() );
        consumer.setAccessTokenLifetime( source.getAccessTokenLifetime() );

        return consumer;
    }

    @Override
    public Consumer mapDTOToDomain(ConsumerEntity source, Consumer destination) {
        if ( source == null ) {
            return null;
        }

        destination.setConsumerKey( source.getConsumerKey() );
        destination.setConsumerSecret( source.getConsumerSecret() );
        destination.setPublicKey( source.getPublicKey() );
        destination.setContactEmail( source.getContactEmail() );
        destination.setName( source.getName() );
        destination.setAutoGrant( source.getAutoGrant() );
        destination.setAccessTokenLifetime( source.getAccessTokenLifetime() );

        return destination;
    }

    @Override
    public List<ConsumerEntity> mapDomainListToDTOList(List<Consumer> source) {
        if ( source == null ) {
            return null;
        }

        List<ConsumerEntity> list = new ArrayList<ConsumerEntity>();
        for ( Consumer consumer : source ) {
            list.add( mapDominToDTO( consumer ) );
        }

        return list;
    }

    @Override
    public List<Consumer> mapDTOListToDomainList(List<ConsumerEntity> source) {
        if ( source == null ) {
            return null;
        }

        List<Consumer> list = new ArrayList<Consumer>();
        for ( ConsumerEntity consumerEntity : source ) {
            list.add( mapDTOToDomain( consumerEntity ) );
        }

        return list;
    }

    @Override
    public List<Consumer> mapDTOListToDomainList(Iterable<ConsumerEntity> source) {
        if ( source == null ) {
            return null;
        }

        List<Consumer> list = new ArrayList<Consumer>();
        for ( ConsumerEntity consumerEntity : source ) {
            list.add( mapDTOToDomain( consumerEntity ) );
        }

        return list;
    }
}
