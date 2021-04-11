package generics;

public class MySimpleGenerics {
    public static void main(String args[]) {
        SimpleGenerics<String, Boolean, Integer> sobj =
                new SimpleGenerics<String, Boolean,Integer>("Hello World", false, 1);
        sobj.display();
        SimpleGenerics<Boolean, Integer, String> sbobj =
                new SimpleGenerics<Boolean,Integer, String>(false, 1, "Hello world");
        sbobj.display();
    }
}//

class SimpleGenerics<T, V, S> {
    private T fobj;
    private V sobj;
    private S tobj;

    public SimpleGenerics(T fobj, V sobj, S tobj) {
        this.fobj = fobj;
        this.sobj = sobj;
        this.tobj = tobj;
    }

    public void display() {
        System.out.println("Type1" + fobj.getClass().getName()
                + " Type2" + sobj.getClass().getName()
                + " Type3" + tobj.getClass().getName());
    }
}
