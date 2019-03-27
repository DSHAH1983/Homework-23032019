import javafx.util.converter.PercentageStringConverter;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class ExamDetail
{
    //input student name, roll no, 3 subjects marks..and find out total, percentage and result

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

        //calculate total of all subjects marks

        double total = Math + Science + Physics;

        System.out.println("Total: " + total);

        System.out.println("Percentage: " + (percentage = +(float) (total * 100 / 300)));

         //nested if else,else if statement with concatenation

        if (percentage >= 80) {
            System.out.println("Grade A+" + " = " + " Pass ");
        } else if (percentage >= 60) {
            System.out.println("Grade A" + " = " + " Pass ");
        } else if (percentage >= 50) {
            System.out.println("Grade B" + " = " + " Pass ");
        } else if (percentage >= 35) {
            System.out.println("Grade C " + " = " + " Pass ");
        } else {
            System.out.println("Fail");
        }
    }
}















