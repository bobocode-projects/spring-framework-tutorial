package com.bobocode.model;

import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@NoArgsConstructor
@Getter @Setter @ToString
@EqualsAndHashCode(of = "credentials")
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private LocalDate creationDate;
    private Credentials credentials;
    private Address address;
    private Set<Role> roles = new HashSet<>();

    public User(String firstName, String lastName, LocalDate birthday, Credentials credentials) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.credentials = credentials;
        this.creationDate = LocalDate.now();
    }

    public void addRole(Role role) {
        roles.add(role);
        role.setUser(this);
    }



}
