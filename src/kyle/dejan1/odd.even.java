import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.println("//instance 1");
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        checkNumber(num1);

 
        System.out.println("\n//instance 2");
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        checkNumber(num2);

        
        System.out.println("\n//instance 1");
        System.out.print("Enter a number: ");
        int num3 = sc.nextInt();
        checkNumber(num3);
    }

    static void checkNumber(int num) {
        if (num == 0) {
            System.out.println("\nInputted number Zero");
        } else if (num % 2 == 0) {
            System.out.println("\nInputted number is even");
        } else {
            System.out.println("\nInputted number is odd");
        }
    }
}
