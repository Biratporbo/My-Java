import java.util.Scanner;
public class PerimeterArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a,p;
        System.out.println("Enter area(square): ");
        a = sc.nextDouble();

        double as= a * a;

        System.out.println("Enter area(perimeter): ");
        p = sc.nextDouble();

        double ps= 4 * p;

        System.out.println("Area of a square is: "+as);
        System.out.println("Perimeter of a square is: "+ps);
    }
}