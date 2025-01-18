import java.util.Scanner;
public class grade {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double grade;
        System.out.println("Enter your marks: ");
        grade=s.nextDouble();
        if(grade<0||grade>100)
        {
            System.out.println("Wrong input");
        }
        else if(grade<30)
        {
            System.out.println("Your grade is: F");
        }
        else if(grade>=30 && grade<=44)
        {
            System.out.println("Your grade is: E");
        }
        else if(grade>=45 && grade<=49)
        {
            System.out.println("Your grade is: D");
        }
        else if(grade>=50 && grade<=59)
        {
            System.out.println("Your grade is: c");
        }
        else if(grade>=60 && grade<=79)
        {
            System.out.println("Your grade is: B");
        }
        else
        {
            System.out.println("Your grade is: A");
        }
    }
}
