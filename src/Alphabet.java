import java.util.Scanner;

public class Alphabet {

    // Input any alphabet from a to f and print their city name accordingly, any other alphabet should be invalid entry

    public static void main(String[] args)
    {    //define scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name with A to F ");
        String alphabet = scanner.next();

        //nested if else, else if statement has been used

        // enter city name according to alphabet from A to F

        if (alphabet.equalsIgnoreCase("a"))
        {
            System.out.println("City name is Ahmedabad");
        }
        else if (alphabet.equalsIgnoreCase("b"))
        {
            System.out.println("City name is Baroda ");
        }
        else if (alphabet.equalsIgnoreCase("c"))
        {
            System.out.println("City name is Calcutta ");
        }
        else if (alphabet.equalsIgnoreCase("d"))
        {
            System.out.println("City name is Dabhoi");

        } else if (alphabet.equalsIgnoreCase("e"))
        {
            System.out.println("City name is Edingburgh ");
        }
        else if (alphabet.equalsIgnoreCase("f"))
        {
            System.out.println("City name is Faridabad ");
        }
        // if entering any other alphabet other then from a to f, then output should say Invalid
        else
            {
            System.out.println("Invalid");

            }
    }
}