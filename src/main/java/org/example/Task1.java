package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void execute() {
        Scanner input = new Scanner(System.in).useLocale(Locale.US); // иначе в RU локале double требует ","
        double number = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            System.out.print("Введите число: ");
            // В Т.З.1 Нет указания, что число должно быть целым, поэтому double
            if (input.hasNextDouble()) {
                number = input.nextDouble();
                isValidInput = true;
            } else {
                System.out.println("Ошибка: введено не число");
                input.next();
            }
        }

        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
