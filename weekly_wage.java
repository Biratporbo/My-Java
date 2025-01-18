import java.util.Scanner;
public class weekly_wage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double wage, hour;
        System.out.println("Enter hours: ");
        hour=s.nextDouble();

        if(hour<0||hour>90)
        {
            System.out.println("Not Allowed");
        }
        else if(hour<=35)
        {
            wage = hour*19;
            System.out.println("Wage : "+wage);
        }
        else if(hour<=60)
        {
            wage = 35*19+ 25*19+ (hour-60)*37;
            System.out.println("Wage : "+wage);
        }
    }
}
