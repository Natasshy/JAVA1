//Необходимо вывести на экран таблицу умножения от 1 до 10
// для введённого пользователем любого числа.
public class TASK5 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                System.out.printf("%5d", (i+1) * (j+1));
        }
        System.out.println();
        }
    }
}