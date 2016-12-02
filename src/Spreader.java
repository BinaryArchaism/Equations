/**
 * Created by BYT9C0D9 on 01.12.2016.
 */
public class Spreader {
    double a, b, c;

    public Spreader(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void Sender() {
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("X - любое число");
        }
        else if (a == 0) {
            LinEq linEq = new LinEq(b, c);
            System.out.println(linEq.Solver());
        }

        else {
            QuadEq quadEq = new QuadEq(a, b, c);
            System.out.println(quadEq.PairSolver());
        }
    }
}
