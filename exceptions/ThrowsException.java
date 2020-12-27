package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public static void main(String args[]) throws FileNotFoundException {
        openF("G:  est.txt");
        System.out.println("reach");
    }

    private static void openF(String fname) throws FileNotFoundException {
        FileInputStream fl = new FileInputStream(fname);
    }
}
