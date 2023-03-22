package org.example;

import java.util.Scanner;

public class Task3 {
    public static void execute() {
        Scanner input = new Scanner(System.in);
        String[] inputArray;
        boolean isValidInput = false;
        do {
            System.out.print("Введите числовой массив: ");
            inputArray = input.nextLine().split(" ");
            /* Проверка введенного массива на то,что он числовой(Т.З.3: на входе есть числовой массив),
            нет указания, что числа должны быть целыми*/
            isValidInput = true;
            for (String i :  inputArray) {
                try {
                    double num = Double.parseDouble(i);
                } catch (NumberFormatException e) {
                    isValidInput = false;
                    break;
                }
            }
            if (!isValidInput) {
                System.out.println("Ошибка: введенный массив содержит не числовые значения");
            }
        } while (!isValidInput);

        System.out.print("Элементы массива, кратные 3: ");

        for (int i = 0; i < inputArray.length; i++)
            if (inputArray[i].contains(".")) {
                if (Double.parseDouble(inputArray[i]) % 3 == 0) {
                    System.out.print(inputArray[i] + " ");
                }
            } else if (Integer.parseInt(inputArray[i]) % 3 == 0) {
                System.out.print(inputArray[i] + " ");
            }

        System.out.println();
    }
}