import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Principle : ");
        int p = SC.nextInt();
        System.out.println("Enter Rate of Interest : ");
        int r = SC.nextInt();
        System.out.println("Enter Time : ");
        int t = SC.nextInt();
        float si = (p*r*t)/100;
        System.out.println("Enter Simple Interest : "+si);
    }
}
