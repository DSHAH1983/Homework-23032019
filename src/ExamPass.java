import java.util.Scanner;

public class ExamPass
{
    // student needs to pass all the subjects and needs to show pass or fail

    public static void main(String[] args) {
        double percentage;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student name ");
        String name = scanner.next();

        System.out.println("Enter Roll number");
        int Rollnumber = scanner.nextInt();

        System.out.println("Math: ");
        int Math = scanner.nextInt();

        System.out.println("Science:");
        int Science = scanner.nextInt();

        System.out.println("Physics:");
        int Physics = scanner.nextInt();

        double total = Math + Science + Physics;

        System.out.println("Total: " + total);

        System.out.println("Percentage: " + (percentage = +(float) (total * 100 / 300)));

        // if else statement with logical operator and concatenation operator

        if (Math <= 35 || Science <= 35 || Physics <= 35) {
            System.out.println("Result = " + " Fail ");
        } else {
            System.out.println("Result = " + " Pass ");
        }
    }

}

















