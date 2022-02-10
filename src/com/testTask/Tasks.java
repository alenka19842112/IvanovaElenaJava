package com.testTask;

import java.util.Scanner;

public class Tasks {
    public void runTaskOne() {
        /**
         * Составить алгоритм: если введенное число больше 7, то вывести “Привет”
         */
        System.out.println("Task 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        if (sc.hasNextDouble()) {
            if (sc.nextDouble() > 7) {
                System.out.println("Hello!");
            } else {
                System.out.println("You entered a number less than or equal to 7");
            }
        } else {
            System.out.println("You didn't enter a number");
        }
        System.out.println("***********************************");
    }

    /**
     * Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
     * если нет, то вывести "Нет такого имени"
     */
    public void runTaskTwo() {
        System.out.println("Task 2");
        String name = "Вячеслав";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        if (sc.nextLine().equals(name)) {
            System.out.println("Hello, " + name);
        } else {
            System.out.println("No such name");
        }
        System.out.println("***********************************");
    }

    /**
     * Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
     */
    public void runTaskTree() {
        System.out.println("Task 3");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numeric array separated by spaces: ");
        String[] inputArray;
        int countElement = 0;
        inputArray = sc.nextLine().split(" ");
        for (String element : inputArray) {
            if (isDigit(element) && Integer.parseInt(element) % 3 == 0) {
                countElement++;
                System.out.print(element + " ");
            }
        }
        if (countElement == 0) {
            System.out.print("There are no numbers in the array that are multiples of 3");
        }
        System.out.println();
        System.out.println("***********************************");
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
