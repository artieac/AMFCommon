package com.alwaysmoveforward.oauth.datalayer.repositories;

/**
 * Created by acorrea on 12/1/2015.
 */

import com.alwaysmoveforward.oauth.DomainModel.User;
import com.alwaysmoveforward.oauth.datalayer.DAO.IUserDAO;
import com.alwaysmoveforward.oauth.datalayer.Mapper.UserMapper;
import com.alwaysmoveforward.oauth.datalayer.tableentities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("JPAUserRepository")
public class UserRepository implements IUserRepository {
    @Autowired
    IUserDAO userDAO;


    @Override
    public User findById(Long id) {
        UserEntity dto = userDAO.findOne(id);

        return UserMapper.instance.mapDTOToDomain(dto);
    }
}
