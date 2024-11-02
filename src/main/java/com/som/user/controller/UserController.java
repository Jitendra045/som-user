package com.som.user.controller;

import com.som.user.model.Response;
import com.som.user.model.Status;
import com.som.user.model.entity.User;
import com.som.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired private UserService userService;

  @Autowired
  @GetMapping("/")
  public Response<?> getAllUser() {
    return userService.getAllUsers();
  }
}
