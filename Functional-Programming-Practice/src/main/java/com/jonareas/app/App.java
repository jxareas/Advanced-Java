package com.jonareas.app;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

    public static <T> void filterMapForEach(List<T> list,
                                            Predicate<T> predicate,
                                            Supplier<T> supplier,
                                            Consumer<T> consumer) {
        list.stream()
                .filter(predicate) // Filtering all values divisible by 2
                .map(value -> supplier.get()) // Replacing each value with a constant
                .forEach(consumer); // Printing each value
    }

    public static <T> void filterMapForEach(List<T> list,
                                            Predicate<T> predicate,
                                            UnaryOperator<T> operator,
                                            Consumer<T> consumer) {
        list.stream()
                .filter(predicate) // Filtering all values divisible by 2
                .map(operator) // Replacing each value with a constant
                .forEach(consumer); // Printing each value
    }

    public static <T> void println(T value) {
        System.out.print(value.toString() + " ");
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        App.filterMapForEach(list,
                (x) -> x % 2 == 0,
                () -> 287,
                App::println
                );
        System.out.println("\n");;
        App.filterMapForEach(list,
                (x) -> x % 2 == 0,
                (x) -> x * x,
                App::println
        );

    }

}
