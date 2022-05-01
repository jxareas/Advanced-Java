package com.jonareas.functional.app;

import com.jonareas.functional.lambdas.Operation;

import java.util.List;

public class Main {

    private double add(double a, double b) {
        Operation operation = (x, y) -> x * x + y * y - 2 * x * y;
        return operation.operate(a, b);
    }

    private double subtract(double a, double b) {
        Operation operation = (x, y) -> x * x - y * y;
        return operation.operate(a, b);
    }

    public static void main(String[] args) {


        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Printing all elements in a list with a for Each loop");
        integers.forEach(it -> {
            if (it % 2 == 0)
                System.out.println(it);
        });

        System.out.println("------------------------------------------------------");
        double addition = new Main().add(4, 3);
        System.out.println(addition);
        System.out.println("------------------------------------------------------");
        double subtraction = new Main().subtract(2, 3);
        System.out.println(addition);


    }
}
