package com.jonareas.app;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerApp {

    public static void println(String string) {
        Consumer<String> print = System.out::println;
        print.accept(string);
    }

    public static void println(List<String> strings) {
        strings.forEach(ConsumerApp::println);
    }

    public static <T> void applyToAll(List<T> list, Consumer<T> consumer) {
        list.forEach(consumer);
    }

    public static void main(String... args) {
        List<String> strings =
                List.of("I love you", "Hello World", "I am a Java Developer");
        ConsumerApp.println(strings);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        ConsumerApp.applyToAll(numbers, x -> System.out.print(x + 1 + " "));
    }

}
