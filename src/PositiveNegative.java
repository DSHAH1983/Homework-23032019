import java.util.Scanner;

public class PositiveNegative
{
    //input any number and find out if it is positive , negative or zero

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int Number = scanner.nextInt();

        //nested if else, else if statement has been used with concatenation operation

        if (Number>3) {
            System.out.println("Number " + Number + " is " + "Positive");

        }

        else if(Number<3)
    {
            System.out.println("Number " + Number + " is " + " Negative ");

        }
        else
        {
            System.out.println("Number " + Number + " is " + " Zero ");
        }
    }

}




