package com.bobocode.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString(exclude = {"user", "creationDate"})
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
