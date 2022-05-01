package com.jonareas.app;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierApp {

    private static LocalDateTime getTimeFiveDaysAgo() {
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now().minusDays(5);
        return supplier.get();
    }

    public static void main(String... args) {
        System.out.println(SupplierApp.getTimeFiveDaysAgo());
    }
}
