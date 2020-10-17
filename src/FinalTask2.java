/*Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Пользователь программы должен задавать размер массива и наполнять его числами.
Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
 */


import java.util.Scanner;
import java.util.Arrays;


public class FinalTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int number = sc.nextInt();
        int[] arr = new int[number];

        System.out.println("Введите " + number + " чисел");
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Массив до сортировки выбором: " + Arrays.toString(arr));
        sort(arr);//сортировка выбором
        System.out.println("Массив после сортировки выбором: " + Arrays.toString(arr));
    }

        public static void sort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {    // i - номер текущего шага
                int pos = i;
                int min = arr[i];
                // цикл выбора наименьшего элемента
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < min) {
                        pos = j;    // pos - индекс наименьшего элемента
                        min = arr[j];
                    }
                }
                arr[pos] = arr[i];
                arr[i] = min;    // меняем местами наименьший с array[i]
            }

        }
    }


