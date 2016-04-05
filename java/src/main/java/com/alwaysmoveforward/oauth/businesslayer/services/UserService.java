package com.alwaysmoveforward.oauth.businesslayer.services;

import com.alwaysmoveforward.oauth.DomainModel.User;
import com.alwaysmoveforward.oauth.datalayer.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by acorrea on 12/1/2015.
 */
@Component
public class UserService {
    public UserService(){
    }

//    @Autowired
//    @Qualifier("JPAUserRepository")
//    IUserRepository userRepository;

//    public User findById(Long id){
//        return userRepository.findById(id);
//    }

}
