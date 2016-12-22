/**
 * Created by BYT9C0D9 on 22.12.2016.
 */
public class WithoutC implements Solver{
    double a, b;
    public WithoutC(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Pair solve() {
        double x2 = -b/a;
        return new Pair(0, x2);
    }
}
