package com.som.user.model.entity;

import com.som.user.model.Gender;
import com.som.user.model.Status;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"user\"")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  private String firstName;

  private String lastName;

  private Gender gender;

  private Integer age;

  private Status status;
}
