package com.alwaysmoveforward.oauth.datalayer.Mapper;

import com.alwaysmoveforward.oauth.DomainModel.Consumer;
import com.alwaysmoveforward.oauth.datalayer.tableentities.ConsumerEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by acorrea on 3/29/2016.
 */

@Mapper
public interface ConsumerMapper {

    ConsumerMapper instance = Mappers.getMapper(ConsumerMapper.class);

    ConsumerEntity mapDominToDTO(Consumer source);

    ConsumerEntity mapDominToDTO(Consumer source, @MappingTarget ConsumerEntity destination);

    Consumer mapDTOToDomain(ConsumerEntity source);

    Consumer mapDTOToDomain(ConsumerEntity source,  @MappingTarget Consumer destination);

    List<ConsumerEntity> mapDomainListToDTOList(List<Consumer> source);

    List<Consumer> mapDTOListToDomainList(List<ConsumerEntity> source);

    List<Consumer> mapDTOListToDomainList(Iterable<ConsumerEntity> source);
}
