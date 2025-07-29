import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Science: ");
        int science = sc.nextInt();

        System.out.print("Enter marks in History: ");
        int history = sc.nextInt();

        System.out.print("Enter marks in Math: ");
        int math = sc.nextInt();

        System.out.print("Enter marks in Soc: ");
        int soc = sc.nextInt();

        System.out.print("Enter marks in Arts: ");
        int arts = sc.nextInt();

       
        int totalMarks = science + history + math + soc + arts;
        double percentage = totalMarks / 5.0;

        String remarks;
        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage <= 75) {
            remarks = "Poor";
        } else if (percentage <= 80) {
            remarks = "Fair";
        } else if (percentage <= 85) {
            remarks = "Good";
        } else if (percentage <= 90) {
            remarks = "Very Good";
        } else {
            remarks = "Excellent";
        }

   
        System.out.println("\nOutput\n");

        System.out.println("Enter name: " + name);
        System.out.println("Enter marks in Science: " + science);
        System.out.println("Enter marks in History: " + history);
        System.out.println("Enter marks in Math: " + math);
        System.out.println("Enter marks in Soc: " + soc);
        System.out.println("Enter marks in Arts: " + arts);
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);

        if (percentage < 70) {
            System.out.println("\nTry Again " + name + ", you did not pass.");
        } else {
            System.out.println("\nCongrats " + name + " you Passed.");
        }

  
        System.out.println("\n//criteria");
        System.out.println("Fail       - Below 70");
        System.out.println("Poor       - 71 to 75");
        System.out.println("Fair       - 76 to 80");
        System.out.println("Good       - 81 to 85");
        System.out.println("Very Good  - 86 to 90");
        System.out.println("Excellent  - 91 to 100");
    }
}
