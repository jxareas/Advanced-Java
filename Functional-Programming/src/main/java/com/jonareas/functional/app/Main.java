package com.jonareas.functional.app;

import com.jonareas.functional.lambdas.Operation;

import java.util.List;

public class Main {

    private double add(double a, double b) {
        Operation operation = (x, y) -> x * x + y * y - 2 * x * y;
        return operation.operate(a, b);
    }

    public static void main(String[] args) {


        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        integers.forEach(it -> {
            if (it % 2 == 0)
                System.out.println(it);
        });

        double addition = new Main().add(2, 3);
        System.out.println(addition);


    }
}
