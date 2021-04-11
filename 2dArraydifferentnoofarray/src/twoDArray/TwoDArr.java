package twoDArray;

import java.util.Scanner;

public class TwoDArr {
    public static void main(String args[]) {
        int arr[][];
        arr = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[5];
        System.out.println("Enter the Values");
        Scanner rd = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rd.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
