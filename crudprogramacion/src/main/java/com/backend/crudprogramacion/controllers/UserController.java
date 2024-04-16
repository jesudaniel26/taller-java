package com.backend.crudprogramacion.controllers;


import com.backend.crudprogramacion.dto.UserDTO;
import com.backend.crudprogramacion.entity.UsersEntity;
import com.backend.crudprogramacion.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;



    public ResponseEntity<UserDTO> saveUserController(UserDTO obj){
        return ResponseEntity.ok(userService.getUser());
    }
}
