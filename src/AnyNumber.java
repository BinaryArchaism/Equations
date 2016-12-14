/**
 * Created by BYT9C0D9 on 08.12.2016.
 */
public class AnyNumber implements Solver{
    double a;
    public AnyNumber(double a) {
        this.a = a;
    }
    public Pair solve(){
        a = Math.sqrt(-2);
        return new Pair(a, a);
    }
}
