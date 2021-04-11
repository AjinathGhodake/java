package finalArray;

public class FinalArray {
    void changeArrayContent(int arr[]){
        arr[0]=10;
        System.out.println(arr.toString());
    }
    void changeArray(int arr[]){
        arr = new int[10];
        System.out.println(arr.toString());
    }
}
