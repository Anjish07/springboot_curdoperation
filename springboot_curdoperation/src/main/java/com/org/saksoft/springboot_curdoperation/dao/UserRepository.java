package com.org.saksoft.springboot_curdoperation.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.saksoft.springboot_curdoperation.entities.UserDetails;


@Repository
public interface UserRepository extends CrudRepository<UserDetails, Integer> {

}
