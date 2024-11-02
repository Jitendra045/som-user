package com.som.user;

import com.som.user.model.Response;
import com.som.user.model.Status;
import com.som.user.model.entity.User;
import com.som.user.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@ActiveProfiles("test")
class UserApplicationTests {

  @Autowired private UserService userService;

  @Test
  void shouldReturnUserData() {

    Response<Object> expected = new Response<>();
    expected.setStatus(Status.SUCCESS);
    expected.setStatusCode(HttpStatus.OK);
    expected.setData(User.builder().firstName("J").lastName("V").build());

    Response<?> response = userService.getAllUsers();

    Assertions.assertEquals(expected.getStatus(),  response.getStatus());
    Assertions.assertEquals(expected.getStatusCode(),  response.getStatusCode());
    Assertions.assertEquals(expected.getData(),  response.getData());
  }
}
