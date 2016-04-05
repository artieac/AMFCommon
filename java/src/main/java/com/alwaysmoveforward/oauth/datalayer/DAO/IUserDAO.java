package com.alwaysmoveforward.oauth.datalayer.DAO;

import com.alwaysmoveforward.oauth.datalayer.tableentities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by acorrea on 12/1/2015.
 */
@Repository
public interface IUserDAO extends CrudRepository<UserEntity, Long>{

}
