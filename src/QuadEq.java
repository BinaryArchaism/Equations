/**
 * Created by Dmitrii on 20.11.2016.
 */
public class QuadEq implements Solver {
    double a, b, c;

    public QuadEq(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Pair solve() {
        double x1, x2;
        double dis = (b*b) - 4 * a * c;
        x1 = (-b - Math.sqrt(dis)) / (2 * a);
        x2 = (-b + Math.sqrt(dis)) / (2 * a);
        return new Pair(x1,x2);
    }
}
