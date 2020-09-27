/*Произведите ввод данных с клавиатуры в массив,
а после этого произведите вывод массива на экран,
где каждый элемент массива умножается на 2. Размер массива задается пользователем.
 */
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int number = sc.nextInt();
        int[] arrays = new int[number];

        System.out.println("Введите значения(числа) массива:");
        for (int i = 0; i < number; i++) {
            arrays[i] = sc.nextInt();
        }
        System.out.println("Введенные значения умноженные на 2:");
        for (int i = 0; i < number; i++) {
            System.out.print (" " + arrays[i] * 2);
        }
       System.out.println();
    }
}

