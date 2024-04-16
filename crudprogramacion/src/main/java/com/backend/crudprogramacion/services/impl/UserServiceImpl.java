package com.backend.crudprogramacion.services.impl;
import com.backend.crudprogramacion.dao.UserDAO;
import com.backend.crudprogramacion.dto.UserDTO;
import com.backend.crudprogramacion.entity.UsersEntity;
import com.backend.crudprogramacion.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public UserDAO saveUser(UserDAO userDAO) {
        return null;
    }

    @Override
    public List<UserDAO> getUser() {
        return List.of();
    }

    @Override
    public List<UserDAO> getUser(UserDTO userDTO) {
        UsersEntity usersEntity = UsersEntity.builder()
                .id(userDTO.getIdUser())
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .birthdate(userDTO.getBirthdate())
                .build();


    @Override
        public List<UserDAO> getUser() {
        List<UsersEntity> usersEntityList = userDAO.findAll();
        .map(userEntity -> UserDTO.builder()
        return UserDTO.builder()
                .id(userDTO.getIdUser())
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .birthdate(userDTO.getBirthdate())
                .build();


        return List.of();
    }
}