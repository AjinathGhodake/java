package lambdaExpressions;

interface First {
    public float calc(float var);
}

public class LambdaExpression {
    public static void main(String args[]) {
        First fr = (var) -> {
            var *= 10;
            return var;
        };
        System.out.println(fr.calc(10));
    }
}
