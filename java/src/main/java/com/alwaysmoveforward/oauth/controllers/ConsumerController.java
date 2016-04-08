package com.alwaysmoveforward.oauth.controllers;

import com.alwaysmoveforward.oauth.DomainModel.Consumer;
import com.alwaysmoveforward.oauth.businesslayer.services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by acorrea on 3/29/2016.
 */
@RestController
@RequestMapping(value = "")
public class ConsumerController
{
    @Autowired
    ConsumerService consumerService;

    /**
     * Get all instances of an {@link Consumer} that matches the given token value.
     *
     * @return {@link Consumer}
     */
    @RequestMapping(value = "/consumers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Consumer> getAll()
    {
        return this.consumerService.findAll();
    }
}