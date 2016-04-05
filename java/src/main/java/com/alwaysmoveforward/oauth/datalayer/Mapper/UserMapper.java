package com.alwaysmoveforward.oauth.datalayer.Mapper;

import com.alwaysmoveforward.oauth.DomainModel.User;
import com.alwaysmoveforward.oauth.datalayer.tableentities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

import com.alwaysmoveforward.oauth.DomainModel.Consumer;
import com.alwaysmoveforward.oauth.datalayer.tableentities.ConsumerEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by acorrea on 3/29/2016.
 */

@Mapper
public interface UserMapper {

    UserMapper instance = Mappers.getMapper(UserMapper.class);

    UserEntity mapDominToDTO(User source);

    UserEntity mapDominToDTO(User source, @MappingTarget UserEntity destination);

    User mapDTOToDomain(UserEntity source);

    User mapDTOToDomain(UserEntity source,  @MappingTarget User destination);

    List<UserEntity> mapDomainListToDTOList(List<User> source);

    List<User> mapDTOListToDomainList(List<UserEntity> source);

    List<User> mapDTOListToDomainList(Iterable<UserEntity> source);
}
