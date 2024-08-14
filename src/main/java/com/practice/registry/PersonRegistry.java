package com.practice.registry;

import com.practice.prototypeBuilder.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PersonRegistry {
    private final Map<UUID, Person> map = new HashMap<>();

    public Person getPerson(UUID id) {
        if (!map.containsKey(id)) return null;
        return map.get(id).clone();
    }

    public void addPerson(Person person) {
        map.put(person.getId(), person);
    }
}
