package multiThreading.src.thread.com;

public class mainThread {
    public static void main(String args[]) {
        Thread thref = Thread.currentThread();
        System.out.println(thref);
        try {
            thref.setPriority(thref.getPriority() + 1);
            thref.setName("MyNam@");
            System.out.println(thref);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }

    }
}
