package com.practice.registry;

import com.practice.prototypeBuilder.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PersonRegistryTest {
    private final PersonRegistry registry = new PersonRegistry();
    private UUID personId1;
    private UUID personId2;

    @BeforeEach
    void setUp() {
        registerFirstPerson();
        registerSecondPerson();
    }

    private void registerSecondPerson() {
        Person person = Person.builder()
                .id(UUID.randomUUID())
                .firstName("reza")
                .lastName("shams")
                .mobile("09123493242")
                .build();
        personId2 = person.getId();
        registry.addPerson(person);
    }

    private void registerFirstPerson() {
        Person person = Person.builder()
                .id(UUID.randomUUID())
                .firstName("ali")
                .lastName("ahmadi")
                .mobile("09128080293")
                .build();
        personId1 = person.getId();
        registry.addPerson(person);
    }

    @Test
    void getPerson() {
        assertNotNull(personId1);
        assertNotNull(registry.getPerson(personId1));
        assertEquals(registry.getPerson(personId1).getId(), personId1);
        assertEquals(registry.getPerson(personId2).getId(), personId2);
    }

    @Test
    void addPerson() {
        Person person = Person.builder()
                .id(UUID.randomUUID())
                .firstName("amin")
                .lastName("rezazadeh")
                .mobile("09198029129")
                .build();
        registry.addPerson(person);
        assertNotNull(registry.getPerson(person.getId()));
        assertEquals(registry.getPerson(person.getId()), person);
        assertEquals(registry.getPerson(person.getId()).getFirstName(), "amin");
    }
}