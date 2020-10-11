/*Необходимо написать программу, которая будет выводить на экран текстовые данные
 из файла .txt, а потом в этот же файл перезаписывать текстовые данные, введенные
 вручную. Количество строк после перезаписи должно быть столько же, сколько и в
 изначальном варианте.
 */


import java.io.*;

public class Task18 {

    public static void main(String[] args) {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("test1.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exp) {
            System.out.println("Ошибка ввода-вывода: " + exp);
        }
        try{
            File myFile = new File("test1.txt");
            FileReader fileReader = new FileReader(myFile);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
            int lineNumber = 0;
            while (lineNumberReader.readLine() != null){
                lineNumber++;
            }

            System.out.println("Количество строк в файле: " + lineNumber);

            lineNumberReader.close();

        }  catch(IOException e){
            e.printStackTrace();
        }


        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Введите текст для перезаписи предыдующих значений.По окончании введите слово 'stop'." );

        try (FileWriter fw = new FileWriter("test1.txt", false))
        {
            do {s = br.readLine();
                if (s.compareTo("stop") == 0) break;
                s = s + "\n";
                fw.write(s);

            } while(s.compareTo("stop") != 0);
        } catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода" + exc);
        }
        System.out.print("Данные успешно перезаписаны в файл \"test1.txt\"");
    }
    }
