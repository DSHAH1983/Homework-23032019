import java.util.Scanner;

public class SalesComission
{
    //input sales id, seller's name, sales amount, salary basic and then find this sales commission
    public static void main(String[] args) {

        Scanner sales = new Scanner(System.in);
        System.out.println("Enter Sales ID: ");
        int Sid = sales.nextInt();

        System.out.println("Enter Seller's Name:");
        String name = sales.next();

        System.out.println("Enter Sales Amount: ");
        int Amount = sales.nextInt();

        System.out.println("Enter Basic Salary: ");
        int Salary = sales.nextInt();

          //nested if else, else if statement has been used with concatenation operation

         //enter any amount over 50000 or equal to 50000
        if (Amount >= 50000)
        {
            System.out.println("35% Commission = " + (double)(Amount / 100) * 35 );
        } //enter any amount equal to 30000 or over 30000 and under 50000
        else if (Amount >= 30000) {
            System.out.println("20% Commission = " + (double)(Amount / 100) * 20);

        } //enter any amount equal to 20000 or over 20000 and under 30000
        else if (Amount >= 20000) {
            System.out.println("10% Commission = " + (double)(Amount / 100) * 10);
        }
          //enter any amount equal to 10000 or over 10000 and under 20000
        else if (Amount >= 10000)
        {
            System.out.println("5% Commission = " + (double)(Amount / 100) * 5);
        } //enter any amount equal to 10000 and under 10000
        else {
            System.out.println("2% Commission = " + (double)(Amount / 100) * 2);


        }

    }

}
