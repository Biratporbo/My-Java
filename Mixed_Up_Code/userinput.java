import java.util.Scanner;
public class userinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double a, b;

        System.out.println("Enter 1st element: ");
        a = sc.nextDouble();

        System.out.println("Enter 2nd element: ");
        b = sc.nextDouble();
        
        System.out.println("Product is: "+(a * b));
        System.out.println("Average is: "+((a + b)/2));
    }
}