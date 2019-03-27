import java.util.Scanner;

public class Interchange

    //input any two numbers and then print their interchanged value

{
    public static void main(String[] args) {

        int a;
        int b;

         //enter value of (int a, int b)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Before Swap Integer a:");
        a = scanner.nextInt();

        System.out.println("Before Swap Integer b:");
        b = scanner.nextInt();

        //how to swap numbers

        //e.g. a = 10 and b = 20, a = (a+b(10+20)=30) that gives value of a = 30

        // as b = 20 and now a = 30 to get the new value of b, b = (a-b(30-20)= 10) that gives value of b = 10

        // to find the final value of 'a', as now b = 10 and a = 30 if we want to find final value of 'a', a = (a-b(30-10)=20) and that give the value of a = 20

        // final value of a= 20 and b =10

        a = a + b;
        b = a - b;
        a = a - b;

        {
            System.out.println("After Swap Integer a = " + a); }

        {
            System.out.println("After Swap Integer b = " + b); }


        }

        }



