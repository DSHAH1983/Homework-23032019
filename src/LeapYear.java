import java.util.Scanner;

public class LeapYear
{
    //input any year like 1989 and find out if it is leap year

    public static void main(String[] args) {

        Scanner year = new Scanner(System.in);
        System.out.println("Enter a year:");
        int Year = year.nextInt();

        // if else statement and concatenation has been used

        if (Year % 4 == 0)
            System.out.println("Given year " +  Year + " is a Leap Year");


        else
                System.out.println("Given year " + Year + " is not a Leap Year");

    }






}
