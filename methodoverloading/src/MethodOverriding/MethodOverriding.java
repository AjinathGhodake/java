package MethodOverriding;

import java.util.*;

class Products {
    private int id;
    private String name;
    Scanner rd = new Scanner(System.in);

    /*Products(int id, String name) {
        this.id = id;
        this.name = name;
    }*/

    void getData() {
        System.out.println("Enter id");
        this.id = rd.nextInt();
        System.out.println("Enter the name");
        this.name = "sadfasfd";
    }

    public void display() {
        System.out.println("Id :" + this.id + " Name :" + this.name);
    }
}

class Laptops extends Products {
    private int srNo;
    private int price;

    Laptops(int srNo, int price) {
        this.srNo = srNo;
        this.price = price;
    }

    @Override
    public void display() {
        super.display();
    }
}

public class MethodOverriding {
    public static void main(String args[]) {
        Laptops pref = new Laptops(1, 10);
        pref.getData();
        pref.display();
    }
}
