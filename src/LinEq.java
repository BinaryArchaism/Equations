/**
 * Created by BYT9C0D9 on 01.12.2016.
 */
public class LinEq {
    double b, c;

    public LinEq(double b, double c) {
        this.b = b;
        this.c = c;
    }
    public Pair Solver() {
        double x;
        if (c > 0) x = -c/b;
        else x = c/-b;
        return new Pair(x, x);
    }
}
