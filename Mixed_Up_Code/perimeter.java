import java.util.Scanner;
public class perimeter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double r,pi = 3.14;
        System.out.println("Enter redius: ");
        r = sc.nextDouble();

        double cp = 2 * pi * r;
        System.out.println("Perimeter of circular plot is: "+cp);
    }
}