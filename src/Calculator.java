import java.util.Scanner;

public class Calculator
{    //input enter any two number and ask user to enter their symbol (+, -, /, *) find addition, subtraction, multiplication and division according to their symbol

    public static void main(String[] args)
    {   // enter integer value of a and b

        Scanner calculator = new Scanner(System.in);
        System.out.println("Enter Integer a:");
        int a = calculator.nextInt();

        System.out.println("Enter Integer b: ");
        int b = calculator.nextInt();

        //using arithmetic operators for addition, subtraction, multiplication and division

        System.out.println("Enter Operator (+, -, *, /) ");
        char operator = calculator.next().charAt(0);

        //nested if else, else if statement has been used with concatenation operation

        // operator for addition is '+'
        if (operator == '+')
        {
            System.out.println("Addition of " + a +  "+" + b + " = " + (a + b));
        }
        //operator for subtraction is '-'
        else if (operator == '-')
        {
            System.out.println("Subtraction of " + b + "-" + a +  " = " + (b - a));
        }
        //operator for multiplication is '*'
        else if (operator == '*')
        {
            System.out.println("Multiplication of " + a + "*" + b + " = " + (a * b));
        }
        // operator for division is '/'
        else if (operator == '/')
        {  System.out.println("Division of " + b + "/" + a + " = " + (b / a));

        }
        //if entered wrong operator then output is 'wrong input'
        else
        {
            System.out.println("Wrong Input");}
    }
}