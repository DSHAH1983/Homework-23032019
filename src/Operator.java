import java.util.Scanner;

public class Operator
{
    //Input any two number and find out its odd or even use turnery operator (? :)

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Integer a: ");
         int a = scanner.nextInt();

         //ternary operator has been used with concatenation

        String oddeven = (a%2==0)? "even" : "odd";
        System.out.println("The given number " + a + " is " + oddeven);

        System.out.println("Enter integer b:");
        int b = scanner.nextInt();


        String evenodd = (b%2==0)? "even" : "odd";
        System.out.println("The given number " + b + " is " + evenodd);








    }










}
