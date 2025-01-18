import java.util.Scanner;
public class Wage{  
    public static void main (String args[]){
        double h,w;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the working hours: ");
        h = sc.nextDouble();
        w = sc.nextDouble();
        
        if(h>=0 || h<=90){
            if(h<=35)
                w= h * 19;
            else if(h<=60)
                w = 35 * 19 + (h-25) * 29;
            else if(h<=90)
                w = 35 *19 + 25 * 19 + (h-60) * 37;
        }
        else
            System.out.println("Wrong input");
            System.out.println("Wage is : " + w);
    }
}