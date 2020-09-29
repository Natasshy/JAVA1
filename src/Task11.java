/*Необходимо произвести ввод строки с клавиатуры и записать
в строковую переменную. Результат вывести на экран.
 */
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите строку:");
    String s = scan.nextLine();
    System.out.println("Ваша строка: " + s);

    }
}
