/**
 * Created by BYT9C0D9 on 01.12.2016.
 */
public class Spreader {
    Solver equ;

    public Spreader(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            equ = new AnyNumber();
        }
        else if (a == 0) {
            equ = new LinEq(b, c);
        }
        else {
            equ = new QuadEq(a, b, c);
        }
    }
    public void Sender() {
        System.out.println(equ.solve());
    }
}
