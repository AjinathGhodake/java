package finalArray;

public class DriverClass {
    public static void main(String args[]) {
        System.out.println("I m running....");
        final int[] arr = new int[5];
        // FinalArray fn = new FinalArray();
        // fn.changeArrayContent(arr);
        // fn.changeArray(arr);
        arr[0] = 10;
        System.out.println(arr.getClass());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
