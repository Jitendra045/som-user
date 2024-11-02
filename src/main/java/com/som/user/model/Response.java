package com.som.user.model;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Response<T> {

  private Status status;
  private HttpStatus statusCode;
  private T data;
}
