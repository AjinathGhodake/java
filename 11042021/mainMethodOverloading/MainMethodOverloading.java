public class MainMethodOverloading {
    public static void main(String args[]){
        System.out.println("Main method executed 1");
    }
    public void main(char args[]){
        System.out.println("Main method overloaded 2");
    }
    public void  main(Double args[]){
        System.out.println("Main Method overloaded 3");
    }
}
