package person;

public class Main {
    public static void main(String args[]) {
        Person p = new Person();
        p.name = "Ajinath";
        p.age = 28;
        p.height = 6;
        p.weight = 93;
        p.gender = "Male";
        p.displayInformation();
        Person p1 = new Person();
        p1.name = "Ashwini";
        p1.age = 21;
        p1.height = 5;
        p1.weight = 56;
        p1.gender = "Female";
        p1.displayInformation();
    }
}