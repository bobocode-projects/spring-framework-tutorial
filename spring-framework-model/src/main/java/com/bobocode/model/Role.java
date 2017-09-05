package com.bobocode.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString(exclude = "user")
@EqualsAndHashCode(of = {"roleType", "user"})
public class Role {
    private Long id;
    private RoleType roleType;
    private LocalDateTime creationDate = LocalDateTime.now();

    private User user;

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }
}
