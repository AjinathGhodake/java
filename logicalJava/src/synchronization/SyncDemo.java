package synchronization;

class Sender {
    public void send(String msg) {
        System.out.println("Sending :" + msg);
        /*try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.out.println("Thread Interruption Occurred");
        }*/
        System.out.println(msg + " Sent");
    }
}

class ThreadedSend extends Thread {
    private String msg;
    private Thread t;
    private Sender sender;

    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    @Override
    public void run() {
        synchronized (sender) {
            sender.send(msg);
        }
    }
}

public class SyncDemo {
    public static void main(String args[]) {
        Sender snd = new Sender();
        ThreadedSend t1 = new ThreadedSend("Hi", snd);
        ThreadedSend t2 = new ThreadedSend("Bye", snd);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
