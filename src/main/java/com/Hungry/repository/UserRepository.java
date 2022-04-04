package com.Hungry.repository;
import com.Hungry.model.UserDao;

import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}