package com.practice.prototypeBuilder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;
import java.util.UUID;

@Getter
@Builder
@ToString
public class Person implements Cloneable {
    private UUID id;
    private String firstName;
    private String lastName;
    private String mobile;
    private String nationalCode;
    private String phone;
    private String email;
    private String fax;
    private String sex;

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(mobile, person.mobile) && Objects.equals(nationalCode, person.nationalCode) && Objects.equals(phone, person.phone) && Objects.equals(email, person.email) && Objects.equals(fax, person.fax) && Objects.equals(sex, person.sex);
    }
}
