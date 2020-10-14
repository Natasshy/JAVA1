/*Необходимо написать программу, которая будет выводить на экран текстовые данные
 из файла .txt, а потом в этот же файл перезаписывать текстовые данные, введенные
 вручную. Количество строк после перезаписи должно быть столько же, сколько и в
 изначальном варианте.
 */


import java.io.*;

public class Task18 {

    public static void main(String[] args) {
        String s;
        int lineNumber = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("test1.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                lineNumber++;
            }
            System.out.println("Количество строк в файле: " + lineNumber);


        } catch (IOException exp) {
            System.out.println("Ошибка ввода-вывода: " + exp);
        }

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Введите текст для перезаписи предыдующих значений - не более " + lineNumber + " строк");


            try (FileWriter fw = new FileWriter("test1.txt", false)) {
                for (int i = 0; i < lineNumber; i++) {

                    s = br.readLine();
                    s = s + "\n";
                    fw.write(s);
                }
            }

              catch (IOException exc) {
                System.out.println("Ошибка ввода-вывода" + exc);
            }
            System.out.print("Данные успешно перезаписаны в файл \"test1.txt\"");
        }
    }

