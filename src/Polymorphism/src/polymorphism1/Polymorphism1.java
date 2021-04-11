package Polymorphism.src.polymorphism1;

import java.util.*;

class Professionals {
    private long NID;
    private float Income;

    void Read_data() {
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter the national Identity Number * annual Income");
        NID = rd.nextLong();
        Income = rd.nextFloat();
    }

    void Print_data() {
        System.out.println("National Identity Number = " + NID + "\nannual Inclome = " + Income);
    }
}

class Doctors extends Professionals {
    private String Specialization;
    private int No_Of_patients;


    void Read_data() {
        super.Read_data();
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter the Specialization is and Number of patients");
        Specialization = rd.nextLine();
        No_Of_patients = rd.nextInt();

    }

    void Print_data() {
        super.Print_data();
        System.out.println("Specialization = " + Specialization + "\nNo of patients = " + No_Of_patients);
    }
}

class Professors extends Professionals {
    private String Subject;
    private float GPA;


    void Read_data() {
        super.Read_data();
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter the Subject and GPA");
        Subject = rd.nextLine();
        GPA = rd.nextFloat();

    }

    void Print_data() {
        super.Print_data();
        System.out.println("Subject = " + Subject + "\nGPA = " + GPA);
    }
}

class Engineers extends Professionals {
    private String Branch;
    private int No_Of_Projects;

    void Read_data() {
        super.Read_data();
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter Branch and Number of Projects");
        Branch = rd.nextLine();
        No_Of_Projects = rd.nextInt();

    }

    void Print_data() {
        super.Print_data();
        System.out.println("Branch = " + Branch + "\nGrade Point Average= " + No_Of_Projects);
    }
}

class Programmers extends Professionals {
    private int No_Of_Softwares;


    void Read_data() {
        super.Read_data();
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter the number of software developed");
        No_Of_Softwares = rd.nextInt();

    }

    void Print_data() {
        super.Print_data();
        System.out.println("Number of sofwares = " + No_Of_Softwares);
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        Professionals pref;
        pref = new Engineers();
        pref.Read_data();
        pref.Print_data();
        /////
        pref = new Professors();
        pref.Read_data();
        pref.Print_data();
        ///
        pref = new Doctors();
        pref.Read_data();
        pref.Print_data();
        //////
        pref = new Programmers();
        pref.Read_data();
        pref.Print_data();
    }
}
