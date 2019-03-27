import java.util.Scanner;

public class WeekDays
{  //input any number, then print Day name of the week accordingly by using if else

    public static void main(String[] args)
    {
        Scanner week= new Scanner(System.in);
        System.out.println("Enter any number between 1 to 7");
        int day;
        day = week.nextInt();

        // number 1 to 7 defines days starting from Sunday as number 1 and so on
        //nested if else, else if statement has been used

        if (day>0 && day == 1) {
            System.out.println("This day is Sunday" );
        }
        else if (day>0 && day == 2)
        {
            System.out.println("This day is Monday");}
        else if(day>0 && day ==3)
        {
            System.out.println("This day is Tuesday");}
        else if(day >0 && day==4) {
            System.out.println("This day if Wednesday");
        }
        else if(day>0 && day==5)
        {
            System.out.println("This day is Thursday");}
        else if(day>0 && day==6)
        {
            System.out.println("This day is Friday");}
        else if(day>0 && day==7) {
            System.out.println("This day is Saturday");
        }

        // if any other number then 1 to 7 then the output Invalid entry e.g. number 8 is Invalid entry
        else
        {
            System.out.println("Invalid Entry");}

    }
}



