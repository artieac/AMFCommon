package com.alwaysmoveforward.oauth.datalayer.Mapper;

import com.alwaysmoveforward.oauth.DomainModel.User;
import com.alwaysmoveforward.oauth.datalayer.tableentities.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-04-13T17:53:34-0400",
    comments = "version: 1.1.0.Beta1, compiler: javac, environment: Java 1.8.0_65 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity mapDominToDTO(User source) {
        if ( source == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( source.getId() );
        userEntity.setFirstName( source.getFirstName() );
        userEntity.setLastName( source.getLastName() );
        userEntity.setEmail( source.getEmail() );
        userEntity.setPasswordSalt( source.getPasswordSalt() );
        userEntity.setPasswordHash( source.getPasswordHash() );
        userEntity.setPasswordHint( source.getPasswordHint() );
        userEntity.setDateCreated( source.getDateCreated() );
        userEntity.setUserStatus( source.getUserStatus() );
        userEntity.setRole( source.getRole() );
        userEntity.setResetToken( source.getResetToken() );

        return userEntity;
    }

    @Override
    public UserEntity mapDominToDTO(User source, UserEntity destination) {
        if ( source == null ) {
            return null;
        }

        destination.setId( source.getId() );
        destination.setFirstName( source.getFirstName() );
        destination.setLastName( source.getLastName() );
        destination.setEmail( source.getEmail() );
        destination.setPasswordSalt( source.getPasswordSalt() );
        destination.setPasswordHash( source.getPasswordHash() );
        destination.setPasswordHint( source.getPasswordHint() );
        destination.setDateCreated( source.getDateCreated() );
        destination.setUserStatus( source.getUserStatus() );
        destination.setRole( source.getRole() );
        destination.setResetToken( source.getResetToken() );

        return destination;
    }

    @Override
    public User mapDTOToDomain(UserEntity source) {
        if ( source == null ) {
            return null;
        }

        User user = new User();

        user.setId( source.getId() );
        user.setFirstName( source.getFirstName() );
        user.setLastName( source.getLastName() );
        user.setEmail( source.getEmail() );
        user.setPasswordSalt( source.getPasswordSalt() );
        user.setPasswordHash( source.getPasswordHash() );
        user.setPasswordHint( source.getPasswordHint() );
        user.setDateCreated( source.getDateCreated() );
        user.setUserStatus( source.getUserStatus() );
        user.setRole( source.getRole() );
        user.setResetToken( source.getResetToken() );

        return user;
    }

    @Override
    public User mapDTOToDomain(UserEntity source, User destination) {
        if ( source == null ) {
            return null;
        }

        destination.setId( source.getId() );
        destination.setFirstName( source.getFirstName() );
        destination.setLastName( source.getLastName() );
        destination.setEmail( source.getEmail() );
        destination.setPasswordSalt( source.getPasswordSalt() );
        destination.setPasswordHash( source.getPasswordHash() );
        destination.setPasswordHint( source.getPasswordHint() );
        destination.setDateCreated( source.getDateCreated() );
        destination.setUserStatus( source.getUserStatus() );
        destination.setRole( source.getRole() );
        destination.setResetToken( source.getResetToken() );

        return destination;
    }

    @Override
    public List<UserEntity> mapDomainListToDTOList(List<User> source) {
        if ( source == null ) {
            return null;
        }

        List<UserEntity> list = new ArrayList<UserEntity>();
        for ( User user : source ) {
            list.add( mapDominToDTO( user ) );
        }

        return list;
    }

    @Override
    public List<User> mapDTOListToDomainList(List<UserEntity> source) {
        if ( source == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>();
        for ( UserEntity userEntity : source ) {
            list.add( mapDTOToDomain( userEntity ) );
        }

        return list;
    }

    @Override
    public List<User> mapDTOListToDomainList(Iterable<UserEntity> source) {
        if ( source == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>();
        for ( UserEntity userEntity : source ) {
            list.add( mapDTOToDomain( userEntity ) );
        }

        return list;
    }
}
