import java.util.Scanner;

public class Greeting {
    public static void main(String args[]) {
        System.out.println("Enter your name : ");
        Scanner SC = new Scanner(System.in);
        String name = SC.nextLine();
        System.out.println("Welcome to my world, "+name);
    }
}
