package methodoverloading;

public class MethodOverloading {
    private int i;

    MethodOverloading() {
        this.i = 10;
    }

    void display() {
        System.out.println(this.i);
    }
    void display(int i) {
        System.out.println(this.i + 1 );
    }

    public static void main(String args[]) {
        MethodOverloading mref = new MethodOverloading();
        mref.display(1);
    }


}
