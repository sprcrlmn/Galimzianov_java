package org.example;

import java.util.Scanner;

public class Menu {
    public static int show() {
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите задание: ");
        System.out.println("1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”");
        System.out.println("2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести \"Нет такого имени\"");
        System.out.println("3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3");
        System.out.println("0. Выход");
        int choice = -1;
        while (choice == -1) {
            System.out.print("Введите выбор: ");
            if (input.hasNextInt()) {
                choice = input.nextInt();
                if (choice >= 0 && choice <= 3) {
                    return choice;
                } else {
                    System.out.println("Ошибка: выберите номер задания: от 1 до 3 или 0 для выхода");
                    choice = -1;
                }
            } else {
                System.out.println("Ошибка: выберите номер задания: от 1 до 3 или 0 для выхода");
                input.next();
            }
        }
        return choice;
    }
}