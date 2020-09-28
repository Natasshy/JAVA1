/*Произведите ввод данных с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
 */

import java.util.Scanner;
public class Task10 {
    // Функция для чтения матрицы
    public static void readMatrixByUser() {
        int m, n, i, j;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.println("Введите количество строк матрицы");
            m = in.nextInt();
            System.out.println("Введите количество колонок матрицы");
            n = in.nextInt();

            // Объявляем матрицу
            int mx [][] = new int[m][n];

            // Чтение значений матрицы
            System.out.println("Введите элементы(числа) матрицы");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    mx [i][j] = in.nextInt();
            }

            // Отображение элементов матрицы
            System.out.println("Введенные значения, умноженные на 3, первая строка");
            for (i = 0; i < m; i++) {
                for (j = 0; j <= n; j++)

                    System.out.print(mx[0][j] * 3 + "  ");
                            }
        }

        catch (Exception e) {
        }

        finally {
            in.close();
        }

    }
    // Код драйвера
    public static void main(String[] args)
    {
        readMatrixByUser();
    }

}