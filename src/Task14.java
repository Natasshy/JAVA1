  /*Необходимо написать программу, которая будет реализовывать следующие действия:
1. Ввод числа с клавиатуры и запись его в строковую переменную S
2. Конвертация строковой переменной S в числовую переменную X типа int
3. Конвертация числа X типа int в число Y типа double
   */
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        String S = scan.nextLine();

        int X = Integer.parseInt (S);
            System.out.println("int X = " + X);

                double Y = (int) X;
                    System.out.println("double Y = " + Y);
    }
}