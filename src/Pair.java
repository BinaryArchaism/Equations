/**
 * Created by Dmitrii on 20.11.2016.
 */
public class Pair {
    double x1, x2;
    int status = 1;

    public Pair(double x1, double x2) {
        if (x1 == x2) {
            status = 1;
        }
        if (x1 != x1 && x2 != x2) {
            status = 2;
        }
        if (x1 == 0) {
            status = 5;
        }
        else {
            this.x1 = x1;
            this.x2 = x2;
            status = 3;
        }
    }

    public Pair(double x1) {
        if (x1 != x1) {
            status = 4;
        }
    }

    @Override
    public String toString() {
        if (status == 1) {
            return "Линейное уравнение, ответ: X = " + x1;
        } else if (status == 2) {
            return "Квадратное уравнение, ответ: Нет решений";
        } else if (status == 3) {
            return "Квадратное уравнение, ответ: X1 = " + x1 + " X2 = " + x2;
        }
        else if (status == 5) {
            return "X1 = "+x1 + " X2 = "+x2;
        }
        else {
            return "X - любое число";
        }
    }
}