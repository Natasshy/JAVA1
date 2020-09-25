
/*Необходимо написать программу, где бы пользователю предлагалось ввести
 с клавиатуры число в переменную number. В программе должны присутствовать константы X, Y, Z.
 Программа должна сравнивать введенное значение с клавиатуры со значением констант и вывести
 на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
  Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Введите число в переменную number:");
                int number = sc.nextInt();
                    sc.close();
        final int x = 3;
        final int y = 2;
        final int z = 1;
            if (number == x || number == y || number == z) System.out.println("Данное значение имеется в константах");
             else
                     System.out.println("Такой константы нет!");
    }
}

