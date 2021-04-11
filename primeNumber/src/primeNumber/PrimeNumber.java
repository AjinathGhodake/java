package primeNumber;

class CountPrime extends Thread {
    private Thread td;
    String name;
    String prNum = "";
    int endNum;
    int startNum;

    CountPrime(int startNum,int endNum, String name) {
        this.endNum = endNum;
        this.startNum = startNum;
        this.name = name;
        td = new Thread(this, name);
        td.start();
    }

    public void run() {
        int i = startNum;
        while (i < endNum) {
            int j = endNum, count = 0;
            while (j > 0) {
                if (i % j == 0)
                    count = count + 1;
                j--;
            }
            if (count == 2)
                prNum = prNum + i + " ";
            i++;
        }
        System.out.println(td.getName());
        System.out.println(prNum);
    }
}

public class PrimeNumber {
    public static void main(String args[]) {
        CountPrime tr1 = new CountPrime(0,50000, "first");
        CountPrime tr2 = new CountPrime(10001,50000, "Second");
    }
}
