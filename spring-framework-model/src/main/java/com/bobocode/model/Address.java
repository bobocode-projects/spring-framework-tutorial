package com.bobocode.model;


import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString(exclude = "user")
@EqualsAndHashCode(exclude = "id")
public class Address {
    private Long id;
    private String city;
    private String street;
    private String streetNumber;
    private String apartmentNumber;
    private String zipCode;
    private LocalDateTime creationDate;
    private User user;
}
