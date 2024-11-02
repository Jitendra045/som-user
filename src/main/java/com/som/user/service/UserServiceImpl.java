package com.som.user.service;

import com.som.user.model.Response;
import com.som.user.model.Status;
import com.som.user.model.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Override
  public Response<?> getAllUsers() {
    Response<Object> response = new Response<>();
    response.setStatus(Status.SUCCESS);
    response.setStatusCode(HttpStatus.OK);
    response.setData(User.builder().firstName("J").lastName("V").build());
    return response;
  }
}
