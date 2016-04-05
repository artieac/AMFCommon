package com.alwaysmoveforward.oauth.datalayer.repositories;

import com.alwaysmoveforward.oauth.DomainModel.User;

/**
 * Created by acorrea on 12/1/2015.
 */
public interface IUserRepository {
    User findById(Long id);
}
