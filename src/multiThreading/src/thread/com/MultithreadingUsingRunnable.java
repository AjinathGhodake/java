package multiThreading.src.thread.com;

class Table implements Runnable {
    private String thread_name;
    private int num;
    private Thread tobj;

    Table(String Thrd_name, int num) {
        this.thread_name = Thrd_name;
        this.num = num;
        this.tobj = new Thread(this, Thrd_name);
        tobj.start();
    }

    @Override
    public void run() {
        int count = 1;
        try {
            while (count <= 10) {
                System.out.println(num + " * " + count + " = " + num * count);
                count++;
                Thread.sleep(750);
            }
        } catch (InterruptedException ir) {
            System.out.println(ir);
        }
    }
}

public class MultithreadingUsingRunnable {
    public static void main(String args[]) {
        Table tblref1 = new Table("First Table", 100);
        int N = 200;
        try {
            for (int c = 1; c <= 10; c++) {
                System.out.println(N + " * " + c + " = " + (N * c));
                Thread.sleep(950);
            }
        } catch (InterruptedException ir) {
            System.out.println(ir);
        }
    }
}
