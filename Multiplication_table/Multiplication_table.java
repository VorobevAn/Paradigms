package Multiplication_table;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Условие:
 * На вход подается число n.
 * Задача:
 * Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
 * Обоснуйте выбор парадигм.
 *
 * В данной задаче решил применить процедурный стиль,
 * так как он позволяет легко расширять и изменять программу не меняя весь код, а работать только с отдельными методами.
 */

public class Multiplication_table {
    public static void main(String[] args) {
        printTable(number());
    }
    /**
     * Получение числа от пользователя через консоль
     */
    private static int number() {
        int num = 0;
        while (num == 0) {
            System.out.print("Введите число от 1 до 10: ");
            try {
                Scanner scanner = new Scanner(System.in);
                num = scanner.nextInt();
                if (num < 1 || num > 10) {
                    System.out.println("Введено не корректное число ");
                    num = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число");
                num = 0;
            }
        }
        return num;
    }

    /**
     * Вывод талицы умножения
     */
    private static void printTable(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}