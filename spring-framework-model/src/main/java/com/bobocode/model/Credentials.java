package com.bobocode.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(of = "email")
@ToString(exclude = {"lastModifiedPassword"})
public class Credentials {
    private String email;
    private String password;
    private LocalDateTime lastModifiedPassword;
}
