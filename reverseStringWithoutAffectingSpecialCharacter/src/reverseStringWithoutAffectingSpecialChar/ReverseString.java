package reverseStringWithoutAffectingSpecialChar;

public class ReverseString {
    public static void reverse(char[] arr) {
        int l = 0, r = arr.length - 1;
        while (r > l) {
                char tmp = arr[l];
                arr[l] = arr[r];
                arr[r] = tmp;
                l++;
                r--;
        }
    }

    public static void main(String args[]) {
        String str = "a!!!x*%*456szdf";
        char[] charStr = str.toCharArray();
        reverse(charStr);
        String revStr = new String(charStr);
        System.out.println("The reverse string is :" + revStr);
    }
}
