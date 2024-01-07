package com.teachmeskills.lesson17.task1;

import com.teachmeskills.lesson17.task1.functional_interface.IFunctionalInterface;
import java.util.Scanner;

/**
 * Задача 1
 * Создать обобщенный функциональный интерфейс.
 * Написать класс с одним методом.
 * В этом методе реализуйте логику:
 * 	- если в консоль введена цифра 1, то: использования интерфейса со строковым типом и передать в метод интерфейса логику реверса строки(вывода строки в обратном порядке).
 *
 * 	- если в консоль введена цифра 2, то: использования интерфейса с целочисленным типом и передать в метод интерфейса логику нахождения факториала числа.
 *
 */

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();


        switch (number) {
            case 1:
                IFunctionalInterface<String> stringIFunctionalInterface = str -> {
                    return String.valueOf(new StringBuilder(str).reverse());
                };
                System.out.println(stringIFunctionalInterface.func("Hello world"));
                break;
            case 2:
                IFunctionalInterface<Integer> integerIFunctionalInterface = integer -> {
                    int count = 1;
                    for (int i = 1; i <= integer; i++) {
                        count *= i;
                    }
                    return count;
                };
                System.out.println("Enter the number");
                int fact = scanner.nextInt();
                System.out.println(integerIFunctionalInterface.func(fact));
                break;
            default:
                System.out.println("Doing nothing");
                break;
        }

    }

}
