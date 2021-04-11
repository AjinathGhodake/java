package generics;

public class GenericsPr {
    public static void main(String args[]) {
        SimpleGenricsPr<String> sg = new SimpleGenricsPr<>("Hi Generic");
        sg.print();
    }
}


class SimpleGenricsPr<T> {
    private T tobj;

    SimpleGenricsPr(T tobj) {
        this.tobj = tobj;
    }

    void print() {
        System.out.println("The object type :" + tobj.getClass().getName());
    }
}
