import java.util.Scanner;

class Factorial{
    public static void main(String args[]) {
        int fact=1,i;
        System.out.println("Enter a number : ");
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial :"+fact);
    }
}