import java.util.Scanner;
/**
 * Created by Dmitrii on 20.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Решение уравнения\n Введите a, b ,c");
        Spreader spreader = new Spreader(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        spreader.Sender();
        sc.close();
    }
}
