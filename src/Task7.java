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
        if (number == x) System.out.println("Данное значение имеется в константах");
        if (number == y) System.out.println("Данное значение имеется в константах");
        if (number == z) System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");
    }
}

