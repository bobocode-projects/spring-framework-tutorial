package com.bobocode.model;

import com.bobocode.model.Gender;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter @Setter
@ToString
@EqualsAndHashCode(of = "email")
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "creation_time")
    private LocalDateTime creationTime;

    @Column(name = "balance")
    private BigDecimal balance = BigDecimal.ZERO;
}
