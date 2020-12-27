package person;

public class Person {
    String name;
    int age;
    int height;
    int weight;
    String gender;

    public void displayInformation() {
        System.out.println();
        System.out.println("Name :" + this.name);
        System.out.println("Age :" + this.age);
        System.out.println("height :" + this.height);
        System.out.println("Weight :" + this.weight);
        System.out.println("Gender :" + this.gender);
    }
}
