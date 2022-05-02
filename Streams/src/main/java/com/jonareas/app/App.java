package com.jonareas.app;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {

    private static List<Integer> filterNumbers(List<Integer> numbers) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> greaterThan5 = number -> number > 5;
        return numbers.stream()
                .filter(isEven.and(greaterThan5))
                .collect(Collectors.toList());
    }

    public static void main(String... args) {
        App app = new App();
        filterNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
                .forEach(System.out::println);
    }

}
