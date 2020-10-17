/*Напишите программу конвертер валют.
Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой.
(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */


import java.util.Scanner;


public class FinalTask3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара: ");
        double value = sc.nextDouble();
        String result = String.format("%.2f",value);


        System.out.println("Введите количество рублей: ");
        double value1 = sc.nextDouble();
        String result1 = String.format("%.2f",value1);


        sc.close();

        double sum = value1 / value;
        String result2 = String.format("%.2f",sum);

        System.out.print("Курс доллара: " + result + ", ");
        System.out.print("Количество рублей: " + result1 + ", ");
        System.out.print("Итого: " + result2 + " долларов");


    }
}
