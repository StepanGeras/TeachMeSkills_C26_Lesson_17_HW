package com.teachmeskills.lesson17.task2;

import java.time.LocalDate;
import java.util.*;

/**
 * Задача 2 (опционально)
 * Получить день недели по дате
 */

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = scanner.nextInt();
        System.out.println("Enter the month");
        int month = scanner.nextInt();
        System.out.println("Enter the year");
        int year = scanner.nextInt();

        LocalDate localDate = LocalDate.of(year, month, day);

        System.out.println(localDate.getDayOfWeek());

    }

}
