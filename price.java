import java.util.Scanner;
public class price {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    double a,b;

    System.out.println("Enter length: ");
    a = sc.nextDouble();

    System.out.println("Enter width: ");
    b = sc.nextDouble();

    double r = a * b;
    System.out.println("Area is: "+r);

    System.out.println("Enter price per squre fit: ");
    double c = sc.nextDouble();

    double price = r * c;
    System.out.println("Printing cost: "+price);
    }
}