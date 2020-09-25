//Написать программу, которая будет выполнять следующие действия:
//1. Ввод трех чисел с клавиатуры x, y, z
//2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
//3. Деление среднего арифметического на 2 без остатка
//4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        System.out.println("Введено число:" + x);
        System.out.println("Введено число:" + y);
        System.out.println("Введено число:" + z);

        int result = x + y + z;
        System.out.println("Среднее арифметическое = " + result / 3.0);

        int result1 = result / 3;
        System.out.println ("Деление среднего арифметического на 2 без остатка = " + result1 / 2);

        if (result1 / 2 > 3)  System.out.println ("Программа выполнена корректно");
    }
}