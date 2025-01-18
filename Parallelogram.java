import java.util.Scanner;
public class Parallelogram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a , b;

        System.out.println("Enter Base: ");
        a = sc.nextDouble();

        System.out.println("Enter Height: ");
        b = sc.nextDouble();

        //double p = a * b;
        System.out.println("Area of parallelogram "+(a * b)); 
    }
}