/*
Необходимо написать программу, которая будет записывать текстовые данные,
введенные с экрана, в файл .txt. Запись ввести в файл до тех пор, пока не будет
введена команда стоп в консоли. Пользователь при тестировании программы по правилу
черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.
 */

import java.io.*;


 public class Task17 {
    public static void main(String[] args) {
        String s;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Введите текст. По окончании введите слово 'stop'.");

        try (FileWriter fw = new FileWriter("newFile.txt"))
            {
                do {s = br.readLine();
                    if (s.compareTo("stop") == 0) break;
                    s = s + "\n";
                    fw.write(s);

                } while(s.compareTo("stop") != 0);
            } catch(IOException exc) {
                System.out.println("Ошибка ввода-вывода" + exc);
            }
        System.out.print("Данные успешно записаны в файл 'newFile.txt'");
    }
}

