import java.util.Scanner;

public class Value

    //Enter any value and the find out if it is number or an alphabet or symbol
   // All characters whether alphabet, digit or special character have ASCII value.
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Value (Alphabet, Number or Symbol)");
        char value = scanner.next().charAt(0);

        //The ASCII value of uppercase alphabets are from 65 to 90.
        //The ASCII value of lowercase alphabets are from 97 to 122.

        //nested if else, else if statement has been used with concatenation operation

        if ((value>= 65 && value<=90)|| (value>=97))
        {
            System.out.println(value + " is an Alphabet"); }

        //the ASCII value for digits is 48 to 57.

        else if(value>=48 && value<=57)
        {
            System.out.println(value + " is a digit"); }

        //everything apart from numbers and alphabets are special character or symbol

        else
            {
                System.out.println(value + " is a special Symbol");
        }


    }

    }



