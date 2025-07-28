/*To determine the net salary of an employee when it is known that the employee is eligible to dearness allowance(DA) of 97% of the basic pay,
House Rent Allowance(HRA)of 57% of the basic pay and medical allowance of Rs.150. It is further known that 12% of the basic pay is deducted from
the gross salary for the Employees' Provident Fund(EPF) and Rs.200 is deducated from the gross pay as the professional tax.*/
import java.util.Scanner;
public class salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double b, nf, da, hra, epf;

        System.out.println("Enter your basic pay: ");
        b = sc.nextDouble();
        da= b * 0.97;
        hra= b * 0.57;
        epf= b * 0.12;
        nf=b + da + hra + 150 - epf - 200;
        System.out.println("Your net salary is: "+nf);
    }
}