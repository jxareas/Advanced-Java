package com.jonareas.app;

import com.jonareas.model.Database;
import com.jonareas.model.MySQL;
import com.jonareas.model.PostgreSQL;

import java.util.List;

public class Main {

    private void unbounded(List<? extends Object> list) {
        for (Object db : list) {
            if(db instanceof MySQL) {
                MySQL mySQL = (MySQL) db;
                System.out.println(mySQL.getPort());
            } else if(db instanceof PostgreSQL) {
                PostgreSQL mySQL = (PostgreSQL) db;
                System.out.println(mySQL.getPort());
            }
        }
    }

    private void upperBounded(List<? extends Database> list) {
        for(Database database : list) {
            System.out.println(database.getPort());
        }
    }

    private void lowerBounded(List<? super MySQL> list) {
        for(Object db : list) {
            System.out.println(db.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        Main program = new Main();
        MySQL db1 = new MySQL(3306);
        MySQL db2 = new MySQL(3307);

        PostgreSQL db3 = new PostgreSQL(5432);
        PostgreSQL db4 = new PostgreSQL(5433);

        List<Database> list = List.of(db1, db2, db3, db4);
        System.out.println("--- UNBOUNDED ---");
        program.unbounded(list);

        System.out.println("--- UPPER BOUNDED ---");
        program.upperBounded(list);

        System.out.println("--- LOWER BOUNDED ---");
        program.lowerBounded(list);
    }

}
