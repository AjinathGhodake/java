package binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String args[]) {
        int l = 0;
        int arr[] = {10, 20, 30, 58, 40, 35};
        Arrays.sort(arr);
        int key = 35;
        int res = Arrays.binarySearch(arr, key);
        if (res >= 0)
            System.out.println("Element found at location :" + res);
        else
            System.out.println("Element not found");
    }
}

