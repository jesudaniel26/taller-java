package com.backend.crudprogramacion.services;

import com.backend.crudprogramacion.dao.UserDAO;

import java.util.List;

public interface UserService {
    UserDAO saveUser(UserDAO userDAO);
    List<UserDAO> getUser();

}
