import java.util.Scanner;
public class interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double p , t , r;

        System.out.println("Enter P : ");
        p = sc.nextDouble();

        System.out.println("Enter T : ");
        t = sc.nextDouble();
        
        System.out.println("Enter R : ");
        r = sc.nextDouble();
        
        double si = (p * t * r)/100;
        System.out.println("Simple interest is: "+si);
        
    }
}