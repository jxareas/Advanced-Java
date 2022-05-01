package com.jonareas.app;

import com.jonareas.model.Person;

import java.util.function.Predicate;

public class PredicateApp {



    private void someMethod() {
        Person person = new Person(1, "Juan", 22);
        if(person.getHasLegalAge().test(person)) {
            System.out.println("This person has legal age.");
        } else System.out.println("This person doesn't have legal age.");


    }

    private void someOtherMethod(int integer) {
        Predicate<Integer> lessThan20 = x -> x < 20;
        Predicate<Integer> moreThan10 = x -> x > 10;

        boolean testResult = lessThan20.and(moreThan10).test(integer);
        System.out.println(testResult);
    }

    private void functionWithPredicate(int integer, Predicate<Integer> predicate) {
        System.out.println(predicate.test(integer));
    }



    public static void main(String... args) {
        PredicateApp app = new PredicateApp();
        app.someMethod();
        app.someOtherMethod(11);
        app.someOtherMethod(22);

        System.out.println("Is 12 < 20?");
        app.functionWithPredicate(12, x -> x < 20);
        System.out.println("Is 13 == 12?");
        app.functionWithPredicate(13, x -> x== 12);
    }

}

