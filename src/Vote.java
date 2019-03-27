import java.util.Scanner;

public class Vote
{   //A person who is eligible to vote must be older than or equal to 18 years old

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Age");
        int Age = scanner.nextInt();

        //if else statement has been used

        // enter age equal to or over 18
        if (Age >= 18) {
            System.out.println("The person is eligible to vote and over or equal to 18");

        } // enter age under 18 and not equal to 18
        else {
            System.out.println("The person is not eligible to vote and under 18 ");
        }
    }

}