package reverseStringWithoutAffectingSpecialChar;

public class ReverseString_1 {
    public static void main(String args[]) {
        String str = "abcd1";
        int count = 0;
        int l = 0, r = 0;
        char[] charArr = str.toCharArray();
        r = charArr.length-1;
        while (l < r) {
            char temp = charArr[l];
            charArr[l] = charArr[r];
            charArr[r] = temp;
            l++;
            r--;
            count++;
        }
        String reverse = new String(charArr);
        System.out.println("The reverse String is :" + reverse + "    The Count is :" + count);
    }
}
