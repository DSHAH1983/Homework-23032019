import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        //input any five number and then find average of five numbers

        //enter integer value of (a,b,c,d,e)

        Scanner average = new Scanner(System.in);
        System.out.println("Enter Integer a: ");
        int a = average.nextInt();

        System.out.println("Enter Integer b: ");
        int b = average.nextInt();

        System.out.println("Enter Integer c ");
        int c = average.nextInt();

        System.out.println("Enter Integer d ");
        int d = average.nextInt();

        System.out.println("Enter Integer e ");
        int e = average.nextInt();

        int Total = a + b + c + d + e;

        //formula for average is sum of the number divided by total number

        System.out.println("Average = " + (Total/5));

    }

}
