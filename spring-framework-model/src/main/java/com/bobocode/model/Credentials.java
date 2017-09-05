package com.bobocode.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(of = "email")
public class Credentials {
    private String email;
    private String password;
    private LocalDateTime lastModifiedPassword;
}
