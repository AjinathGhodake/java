package ThrowClause.src.throwClause;

public class ThrowClause {
    public static void main(String args[]) {
        int var1 = 100, var2 = 20, var3 = 3000, var4;
        try {
            var4 = (var1 * var2) - var3;
            if (var4 < 0) {
                NullPointerException nr = new NullPointerException("Invalid Output");
                throw (nr);
            }
            System.out.println("Output is = " + var4);
        } catch (NullPointerException nref) {
            System.out.println(nref);
        }
        System.out.println("Execution completed");
    }
}
