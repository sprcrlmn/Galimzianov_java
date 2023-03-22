package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void execute() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя: ");
        // из Т.З.2 не понятно, должно ли вводимое имя быть в правильном регистре, сделал приведение и проверку по LowerCase
        String name = input.nextLine().toLowerCase(Locale.ROOT);
        if (name.equals("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}