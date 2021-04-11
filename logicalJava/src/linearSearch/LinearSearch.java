package linearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main() {
        int array[], n = 0;
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter the number of array element :");
        n = rd.nextInt();
        array = new int[n];
        System.out.println("Enter the numbers :");
        for (int i = 0; i <= n; i++) {
            array[i] = rd.nextInt();
        }
    }
    static void display(int i){
        System.out.printf("The element Found at location: %d",i);
    }
}
