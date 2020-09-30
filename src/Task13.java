/*Необходимо провести сравнение длины двух строк,
которые были введены с клавиатуры и записаны в соответствующие переменные.
Вывести на экран строку с наибольшей длиной. Если длины равны,
вывести соответствующее сообщение.
 */
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку1:");
        String s = scan.nextLine();
        System.out.println("Введите строку2:");
        String d = scan.nextLine();

        if (s.length() > d.length())
            System.out.println("Самая длинная строка: " + s);
        else if (s.length() < d.length())
            System.out.println("Самая длинная строка: " + d);
        else
            System.out.print("Строки одинаковы по длине");
    }
}