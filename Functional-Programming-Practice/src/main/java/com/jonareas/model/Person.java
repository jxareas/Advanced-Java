package com.jonareas.model;

import lombok.*;

import java.util.function.Predicate;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Person {
    @NonNull
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private Integer age;

    @Setter(AccessLevel.NONE)
    private Predicate<Person> hasLegalAge =
            person -> person.getAge() >= 18;
}

