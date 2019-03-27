import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Employee
{   //input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary

    public static void main(String[] args)
    {
        //scanner object has been defined
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee id: ");
        int eid = scanner.nextInt();

        System.out.println("Enter Employee name: ");
        String name = scanner.next();

        System.out.println("Enter basic salary: ");
        int salary = scanner.nextInt();

         // commission formula is calculating percentage

        double HRA = (salary*10/100);
        System.out.println("HRA = " + HRA);

        double DA = (salary*8/100);
        System.out.println("DA = " + DA);

        double TA = (salary*9/100);
        System.out.println("TA = " + TA);

        double PF = (salary*20/100);
        System.out.println("PF = " + PF);

        double Grosssalary = (salary + HRA + DA + TA  + (-PF));
        System.out.println("Gross Salary of Dhara is " + Grosssalary);


    }






}
