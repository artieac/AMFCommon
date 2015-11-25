package com.alwaysmoveforward.oauth.datalayer.Mappers;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;

import javax.annotation.PostConstruct;

/**
 * Created by acorrea on 11/25/2015.
 */
public class DomainModelMapper
{

    private ModelMapper modelMapper;

    public DomainModelMapper()
    {
        initializeMapper();
    }

    @PostConstruct
    private void initializeMapper()
    {
        modelMapper = new ModelMapper();

        // do not map null objects
        modelMapper.getConfiguration().setPropertyCondition(
                Conditions.isNotNull());
    }

    private ModelMapper getMapper()
    {
        if (modelMapper == null)
        {
            initializeMapper();
        }
        return modelMapper;
    }

    @SuppressWarnings("unused")
    private void setMapper(ModelMapper mapper)
    {
        this.modelMapper = mapper;
    }

    /**
     * Implementation of map to convert one object into another.
     *
     * @param source
     * @param destinationType
     * @return mapped object that matches the expected destinationType
     */
    public <D> D map(Object source, Class<D> destinationType)
    {
        return getMapper().map(source, destinationType);
    }

}

