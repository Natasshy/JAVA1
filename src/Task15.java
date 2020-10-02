/*Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Использовать пузырьковый метод сортировки.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите длину массива:");
    int number = sc.nextInt();
    int[] arr = new int[number];

    System.out.println("Введите " + number + " чисел");
    for (int i = 0; i < number; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println("массив перед пузырьковой сортировкой : " + Arrays.toString(arr));

    // сортируем массив
    bubbleSort(arr);

    System.out.println("массив после пузырьковой сортировки : " + Arrays.toString(arr));
}
//  метод пузырьковой сортировки
    public static void bubbleSort(int[] number) {
        boolean flag = true;   // устанавливаем наш флаг в true для первого прохода по массиву

        while (flag) {
            flag = false;    // устанавливаем флаг в false в ожидании возможной замены местами
            for (int j = 0; j < number.length - 1; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];         // меняем элементы местами, temp - вспомогательная переменная
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                    flag = true;  // true означает, что замена местами была проведена
                }
            }
        }
    }
}


