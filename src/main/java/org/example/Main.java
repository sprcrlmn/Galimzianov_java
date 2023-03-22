package org.example;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int choice = Menu.show();
            switch (choice) {
                case 1:
                    Task1.execute();
                    break;
                case 2:
                    Task2.execute();
                    break;
                case 3:
                    Task3.execute();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}