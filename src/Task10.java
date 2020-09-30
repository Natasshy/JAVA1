/*Произведите ввод данных с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
 */

import java.util.Scanner;
public class Task10 {
    // Функция для чтения матрицы
    public static void readMatrixByUser() {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество строк матрицы");
            int m = in.nextInt();
            System.out.println("Введите количество колонок матрицы");
            int n = in.nextInt();

            // Объявляем матрицу
            int mx1 [][] = new int[m][n];

            // Чтение значений матрицы
            System.out.println("Введите элементы(числа) матрицы");
                for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    mx1 [i][j] = in.nextInt();
            }

            // Отображение элементов матрицы
            System.out.println("Введенные значения, умноженные на 3, первая строка");{
                for (int j = 0; j < n; j++)
            System.out.print(mx1[0][j] * 3 + "  ");
            }
    }
    // Код драйвера
    public static void main(String[] args)   {readMatrixByUser(); }

}