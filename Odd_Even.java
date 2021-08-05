import java.util.Scanner;
public class Odd_Even {
    public static void main(String args[]) {
        System.out.println("Enter a number : ");
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
