import java.util.Scanner;

public class Uppercase
{
      //Input any alphabet in uppercase and print it in lowercase

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Alphabet in Uppercase ");

        //char data type formula
        char alphabet = scanner.next().charAt(0);
        //if else statement has been used with concatenation operation

        //predefined formula for character where user can input Upper case alphabet
        if (Character.isUpperCase(alphabet))
        { //predefined formula for character where user can input Upper case alphabet and output is in lowercase with predefined formula for lower case

            System.out.println("The lowercase of " + alphabet + " is " + Character.toLowerCase(alphabet));
        } else {
            System.out.println("Please input valid Uppercase alphabet ");

        }

    }

}
