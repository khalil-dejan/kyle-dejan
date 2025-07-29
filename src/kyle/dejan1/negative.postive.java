import java.util.Scanner;

public class NumberSignCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("//instance 1");
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        checkSign(num1);

      
        System.out.println("\n//instance 2");
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        checkSign(num2);

      
        System.out.println("\n//instance 1");
        System.out.print("Enter a number: ");
        int num3 = sc.nextInt();
        checkSign(num3);
    }

    static void checkSign(int num) {
        if (num > 0) {
            System.out.println("\n" + num + " is a positive number");
        } else if (num < 0) {
            System.out.println("\n" + num + " is a negative number");
        } else {
            System.out.println("\nInputted number Zero");
        }
    }
}
