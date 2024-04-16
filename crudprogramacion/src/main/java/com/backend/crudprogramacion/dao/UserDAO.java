package com.backend.crudprogramacion.dao;

import com.backend.crudprogramacion.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UsersEntity, Integer> {


}
