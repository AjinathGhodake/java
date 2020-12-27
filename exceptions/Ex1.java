package exceptions;

import person.Person;

public class Ex1 {
    public static void main(String args[]) {
        try {
            int arr[] = { 1, 8, 9 };
            System.out.println(arr[2]);
            Person p = new Person();
            p.displayInformation();
            // throw new ArithmeticException("Division by zero not possible");
            // System.out.println(arr[1] / 0);
            // arr[3] = 1;

        } catch (ArithmeticException e) {
            System.out.println("catch block" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Number is not divisible by zero" + e);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("In Finally block");
        }
        System.out.println("After try catch finally");
    }
}