package com.bobocode.util;


import com.bobocode.model.*;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class TestDataGenerator {

    public static Set<Role> generateRoleSet() {
        Random random = new Random();
        Predicate<RoleType> randomPredicate = i -> random.nextBoolean();

        return Stream.of(RoleType.values())
                .filter(randomPredicate)
                .map(Role::new)
                .collect(toSet());
    }

    public static User generateUser(RoleType... roles) {
        User user = generateUser();
        Stream.of(roles)
                .map(Role::new)
                .forEach(user::addRole);

        return user;
    }


    public static User generateUser() {
        Fairy fairy = Fairy.create();
        Person person = fairy.person();

        User user = new User();
        user.setFirstName(person.getFirstName());
        user.setLastName(person.getLastName());
        user.setBirthday(LocalDate.of(
                person.getDateOfBirth().getYear(),
                person.getDateOfBirth().getMonthOfYear(),
                person.getDateOfBirth().getDayOfMonth()));
        user.setCreationDate(LocalDate.now());

        Credentials credentials = new Credentials();
        credentials.setEmail(person.getEmail());
        credentials.setPassword(person.getPassword());
        credentials.setLastModifiedPassword(LocalDateTime.now());

        user.setCredentials(credentials);

        return user;
    }

    public static Address generateAddess() {
        Fairy fairy = Fairy.create();
        Person person = fairy.person();

        Address address = new Address();
        address.setCity(person.getAddress().getCity());
        address.setStreet(person.getAddress().getStreet());
        address.setStreetNumber(person.getAddress().getStreetNumber());
        address.setApartmentNumber(person.getAddress().getApartmentNumber());
        address.setCreationDate(LocalDateTime.now());
        address.setZipCode(person.getAddress().getPostalCode());

        return address;
    }

    public static User generateUserWithAddressAndRoles(){
        User user = generateUser();
        user.setAddress(generateAddess());
        user.setRoles(generateRoleSet());
        return user;
    }

    public static List<User> generateUserList(int maxSize){
        Random random = new Random();
        int size = random.nextInt(maxSize);

        return LongStream.rangeClosed(1L, size)
                .mapToObj(i-> {
                    User user = generateUserWithAddressAndRoles();
                    user.setId(i);
                    return user;
                })
                .collect(toList());
    }


}