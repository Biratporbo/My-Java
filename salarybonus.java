import java.util.Scanner;
public class salarybonus {
    public static void main(String[] args) {
        double salary, bonus,t;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        salary= s.nextDouble();
        System.out.println("Enter years of service: ");
        t=s.nextDouble();
        
        if(t>5)
        {
            bonus=(salary+(salary*5)/100);
            System.out.println("Net bonus: "+bonus);
        }
        else{
            System.out.println("No Bonus");
        }
    }
}