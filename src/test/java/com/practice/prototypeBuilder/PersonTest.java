package com.practice.prototypeBuilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
    private Person person;

    @BeforeEach
    void setUp() {
        person = Person.builder()
                .firstName("amin")
                .lastName("rezazadeh")
                .mobile("09198029129")
                .sex("male")
                .build();
    }

    @Test
    void testClone() {
        Person clonedPerson = person.clone();
        Assertions.assertNotNull(clonedPerson);
        Assertions.assertEquals(person, clonedPerson);
        Assertions.assertNotEquals(person.hashCode(), clonedPerson.hashCode());
    }

    @Test
    void getFirstName() {
        Assertions.assertNotNull(person);
        Assertions.assertEquals("amin", person.getFirstName());
    }
}