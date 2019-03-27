import java.util.Scanner;

public class Vowels

    // when user enter vowels or consonant it should say if it's vowel or consonant
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Alphabet");

        //this is code for 'char'
        char alphabet = scanner.next().charAt(0);

        // words are built from vowels(a,e,i,o,u) and rest of the alphabets are consonant

        //The letter 'y' is a bit different, because sometimes it acts as a consonant and sometimes it acts as a vowel.

        //nested if else, else if statement has been used with logical operation

        //alphabets are Vowels in lowercase
        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
        {
            System.out.println(alphabet + " is Vowel"); }

        //this alphabets are Vowels in uppercase
        else if(alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U')

        {
            System.out.println(alphabet + " is Vowel"); }


        //the letter Y is sometimes considered a sixth vowel because it can sound like other vowels.
        else if(alphabet== 'y' || alphabet == 'Y')
        {
            System.out.println(alphabet + " is sometimes Vowel and Consonant both ");}


         // words are built from vowels(a,e,i,o,u) and rest of the alphabets are consonant
        else
        {
            System.out.println(alphabet + " is Consonant"); }

    }


}
