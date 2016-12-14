/**
 * Created by Dmitrii on 20.11.2016.
 */
public class Pair {
    double x1, x2;
    int status = 1;
    public Pair(double x1, double x2) {
        if (x1 != x1 && x2 != x2) {
            status = 2;
        }
        else {
            this.x1 = x1;
            this.x2 = x2;
        }
    }
    @Override
    public String toString() {
        if (status == 2) {
            return "Квадратное уравнение, ответ: Нет решений";
        }
        else if (x1 == x2) {
            return "Линейное уравнение, ответ: X = " + x1;
        }
        else {return "Квадратное уравнение, ответ: X1 = " + x1 + " X2 = " + x2;}
    }
}
